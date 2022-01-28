package com.eomcs.app1;

import java.io.PrintStream;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.Scanner;

public class Worker extends Thread {

  Socket socket;

  public Worker(Socket socket) {
    this.socket = socket;
  }


  @Override
  public void run() {
    try {
      Scanner in = new Scanner(socket.getInputStream());
      PrintStream out = new PrintStream(socket.getOutputStream());

      // 1) HTTP 요청 데이터 읽기
      String requestLine = in.nextLine(); // 엔터나올때까지 \n

      // 나머지 데이터는 버린다.
      while (true) {
        String str = in.nextLine();
        if (str.length() == 0) {
          break;
        }
      }

      // 예) requestLine = "GET /plus/100/200 HTTP/1.1"
      String requestUri = requestLine.split(" ")[1];// /plus/100/200
      String[] values = requestUri.split("/");// "" plus 100 200

      if (values.length == 4) {

        // 파싱
        String op = URLDecoder.decode(values[1], "UTF-8"); // %2b -> "+"
        int a = Integer.parseInt(values[2]); // 100
        int b = Integer.parseInt(values[3]); // 200
        System.out.printf("%s, %d, %d\n", op, a, b);

        String response = null;

        switch (op) {
          case "+": 
            response = String.format("승범: %d + %d = %d", a, b, (a+b));
            break;
          case "-":
            response = String.format("승범: %d - %d = %d", a, b, (a-b));
            break;
          case "*":
            response = String.format("승범: %d * %d = %d", a, b, (a*b));
            break;
          case "/":
            response = String.format("승범: %d / %d = %d", a, b, (a/b));
            break;
          default:
            response = "승범: 지원하지 않는 연산자입니다.";
        }
        writeResponse(out, response);
      } else {
        writeResponse(out, "요청 형식이 올바르지 않습니다.");
      }


      socket.close();
      System.out.println("클라이언트 연결 종료!");

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  // HTTP 응답 프로토콜 (오타가 있으면 안된다.)
  // 응답하고 싶을때 사용하면됨
  //
  private void writeResponse (PrintStream out, String messageBody) throws Exception {

    out.println("HTTP/1.1 200 OK");
    out.println("Content-Type: text/plain; charset=UTF-8");
    //    out.printf("content-Length: %d\n", messageBody.length());
    out.println();
    out.print(messageBody);
    out.println();
  }
}
