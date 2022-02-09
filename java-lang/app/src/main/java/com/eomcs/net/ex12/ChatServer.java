package com.eomcs.net.ex12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {

  int port;
  @SuppressWarnings("rawtypes") // 신경쓰지말것 Arraylist를 import 했기 때문에 생김
  // client에서 보낸 메시지들을 담는 ArrayList
  // 원래는 제네릭을 사용해야 하지만 사용하지 않음
  ArrayList clientOutputStreams = new ArrayList();

  // port 설정
  public ChatServer(int port) {
    this.port = port;
  }

  // 서버 실행
  public void service() {
    try (ServerSocket serverSocket = new ServerSocket(this.port)) { // socket생성
      System.out.println("서버 실행 중...");

      while (true) {
        new RequestHandler(serverSocket.accept()).start();
      }

    } catch (Exception e) {
      System.out.println("서버 실행 오류 -" + e.getMessage());
    }
  }

  // 다수의 client 에서 받은 메시지들을 다수의 client에게 뿌림
  public void sendMessage(String message) {
    for (int i = 0; i < clientOutputStreams.size(); i++) {
      DataOutputStream out = (DataOutputStream) clientOutputStreams.get(i);
      try {out.writeUTF(message);} catch (Exception e) {}
    }
  }


  class RequestHandler extends Thread {
    Socket socket;

    public RequestHandler(Socket socket) {
      this.socket = socket;
    }

    @Override
    public void run() {
      try (Socket socket2 = socket;
          DataOutputStream out = new DataOutputStream(socket.getOutputStream());
          DataInputStream in = new DataInputStream(socket.getInputStream())) {

        clientOutputStreams.add(out);

        out.writeUTF("환영합니다.");
        out.flush();

        while (true) {
          String message = in.readUTF();
          if(message.equals("\\quit")) {
            out.writeUTF("Goodbye!");
            out.flush();
            break;
          }
          sendMessage(message);
        }

      } catch (Exception e) {
        System.out.println("클라이언트와의 통신 오류! - " + e.getMessage());
      }
    }
  }

  public static void main(String[] args) {
    new ChatServer(8888).service(); // 생성자를 통해 port번호 설정하고 service() 호출
  }
}
