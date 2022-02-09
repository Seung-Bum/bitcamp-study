package com.eomcs.net.ex12.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ChatClient extends Frame {
  private static final long serialVersionUID = 1L;

  // 실무에서는 this를 뺀다.
  public ChatClient() {
    super("계산기");
    this.addWindowListener(new WindowAdapter() { // 슈퍼클래스의 생성자 호출
      @Override
      public void windowClosing(WindowEvent e) {
        // 윈도우의 x 버튼을 눌렀을 때
        System.exit(0);
      }
    });

    this.setSize(400, 300);


    Panel topPanel = new Panel();
    topPanel.setLayout(new FlowLayout(FlowLayout.LEFT));    

    TextField addressTF = new TextField(30);
    topPanel.add(addressTF);

    TextField portTF = new TextField(4);
    topPanel.add(portTF);

    Button connectBtn = new Button("연결");
    topPanel.add(connectBtn);

    add(topPanel, BorderLayout.NORTH);


    TextArea messageListTa = new TextArea();
    add(messageListTa, BorderLayout.CENTER);


    Panel bottomPanel = new Panel();
    // 기본 레이아웃 관리자를 교체!
    bottomPanel.setLayout(new FlowLayout(FlowLayout.LEFT)); 

    TextField messageTf = new TextField(40);
    bottomPanel.add(messageTf);

    Button sendBtn = new Button("보내기");
    bottomPanel.add(sendBtn);

    add(bottomPanel, BorderLayout.SOUTH);


    this.setVisible(true);
  }

  public static void main(String[] args) {
    // main() 호출 끝나도 창을 종료할 때까지 JVM은 실행된다.
    new ChatClient();
  }

}
