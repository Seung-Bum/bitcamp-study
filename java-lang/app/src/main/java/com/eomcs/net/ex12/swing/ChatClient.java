package com.eomcs.net.ex12.swing;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class ChatClient extends JFrame {
  private static final long serialVersionUID = 1L;

  // 통신 도구
  Socket socket;
  DataInputStream in;
  DataOutputStream out;
  String nickname; // 기본으로 null값이 생성된다.

  // JFrame 도구
  JTextField messageTf = new JTextField(35); // message
  JTextField portTf = new JTextField(4); // port
  JTextField addressTf = new JTextField(30); // IP
  JTextArea messageListTa = new JTextArea(); // text

  JButton connectBtn = new JButton("연결"); // 버튼 생성


  // 실무에서는 this를 뺀다.
  public ChatClient() {
    //    super("채팅!"); // super는 JFrame , 자동 삽입된다.

    String title = "대화명을 입력하세요.\n(2자이상)";

    while (true) {
      nickname = JOptionPane.showInputDialog(title);

      if (nickname == null) {
        System.exit(0);
      } else if(nickname != null && nickname.length() >= 2) {
        break;
      } 
      title = "대화명을 다시 입력하세요!\n(2자이상)";
    }

    setTitle("채팅!! - " + nickname); // 상속받은 메서드

    addWindowListener(new WindowAdapter() { // 슈퍼클래스의 생성자 호출
      @Override
      public void windowClosing(WindowEvent e) {
        if (connectBtn.getText().equals("종료")) {
          try {
            out.writeUTF("\\quit");
            out.flush();
          } catch (Exception ex) {}
        }
        // 윈도우의 x 버튼을 눌렀을 때
        try {in.close();} catch (Exception ex) {}
        try {out.close();} catch (Exception ex) {}
        // socket 닫기, 먼저 닫으면 안된다.
        try {socket.close();} catch (Exception ex) {}
        System.exit(0);
      }
    });
    setSize(500, 400);


    // top(IP, port)
    // Frame에 바로 추가하는게 아니고 
    // Frame의 contentPane에 따로 추가한다.
    Container contentPane = this.getContentPane(); // 전체 Frame
    JPanel topPanel = new JPanel(); // Frame의 top
    topPanel.setLayout(new FlowLayout(FlowLayout.LEFT)); // LEFT정렬
    topPanel.add(addressTf); // top에 IP
    topPanel.add(portTf); // top에 port

    // 서버연결 버튼에 connectChatServer 이벤트 추가
    connectBtn.addActionListener(this::connectChatServer); 
    topPanel.add(connectBtn); // top에 연결버튼 추가
    contentPane.add(topPanel, BorderLayout.NORTH); // 만들어진 topPanel을 전체 캔버스에 추가


    // message 작성
    JScrollPane scrollPane = new JScrollPane(messageListTa); // messageListTa에 스크롤 생성
    // 생성된 스크롤(messageListTa와 같이) 전체 캔버스에 추가
    contentPane.add(scrollPane, BorderLayout.CENTER);


    // message 보내기
    JPanel bottomPanel = new JPanel(); // bottomPanel 생성
    // 기본 레이아웃 관리자를 교체!
    bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
    bottomPanel.add(messageTf); // 메시지 JTextField 패널에 추가
    JButton sendBtn = new JButton("보내기"); // 메시지 보내기 버튼 생성
    sendBtn.addActionListener(this::sendMessage); // 메시지 보내기 버튼에 이벤트 생성
    bottomPanel.add(sendBtn); // bottomPanel 버튼 추가
    contentPane.add(bottomPanel, BorderLayout.SOUTH); // 

    // enter를 누르면 실행되게
    messageTf.addActionListener(this::sendMessage);

    setVisible(true); //창을 화면에 나타낼 것인지 설정

  }


  public static void main(String[] args) throws Exception {
    // main() 호출 끝나도 창을 종료할 때까지 JVM은 실행된다.

    // OS 상관없이 같은 UI출력(기본 OS에 맞춰서)
    UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    new ChatClient(); // 채팅창 생성, 실행
  }


  // 서버연결
  public void connectChatServer(ActionEvent e) {
    if (connectBtn.getText().equals("연결")) {

      try {
        socket = new Socket(
            addressTf.getText(), // IP주소 가져오기
            Integer.parseInt(portTf.getText())); // port번호 가져오기

        // socket in, out 도구들
        in = new DataInputStream(socket.getInputStream());
        out = new DataOutputStream(socket.getOutputStream());

        out.writeUTF(nickname);
        out.flush();

        // 서버에서보낸 메시지 받음 (다른 사용자가 보낸 값들을 받음)
        new MessageReceiver(in).start(); // Thread 실행

      } catch (Exception ex) {
        // 오류 메시지 창 띄우기
        JOptionPane.showMessageDialog(this, "서버에 연결 중 오류 발생!", "통신 오류!", JOptionPane.ERROR_MESSAGE);
      }

      connectBtn.setText("종료");
    } else {

      connectBtn.setText("연결");
      messageListTa.setText("");
    }
  }

  // 메시지 보내기
  public void sendMessage(ActionEvent e) {
    System.out.println("메시지 보내기");

    // 메시지가 없을때
    if (messageTf.getText().length() == 0) {
      return;
    }

    // 메시지 출력
    try {
      out.writeUTF(messageTf.getText());
      out.flush();
      messageTf.setText("");

    } catch (Exception ex) {
      JOptionPane.showMessageDialog(this, "메시지 전송 오류!", "통신 오류!", JOptionPane.ERROR_MESSAGE);
    }


  }

  // 다중 클라이언트 서버 이용을 가능하게함 
  // 서버에서 보낸값을 바로바로 받는다.
  class MessageReceiver extends Thread {

    DataInputStream in;

    public MessageReceiver(DataInputStream in) {
      this.in = in;
    }

    @Override
    public void run() {
      while (true) {
        try {
          String message = in.readUTF();
          if (message.equals("<![QUIT[]]>")) { // 서버에서 연결을 끊겠다는 메시지가 오면 스레드를 종료한다.
            break; // 스레드 종료? run() 메서드의 실행을 마치면 스레드는 종료한다.
          }
          messageListTa.append(message + "\n");

        } catch (Exception e) {

        }
      }
    }
  }
}
