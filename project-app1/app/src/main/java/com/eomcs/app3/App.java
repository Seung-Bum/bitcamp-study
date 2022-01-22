package com.eomcs.app3;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Scanner KeyScan = new Scanner(System.in);

    while (true) {
      System.out.println(">>>");
      String input = KeyScan.nextLine();

      if (input.equals("exit") || input.equals("quit")) {
        break;

      } else if (input.length() == 0) {
        continue;

      } else if (input.equals("help")) {
        System.out.println("사용법:");
        System.out.println("App [명령] [값1] [값2]");
        System.out.println("명령:");
        System.out.println("add   [값1] [값2]     더하기 계산을 수행한다. 예) App add 100 200");
        System.out.println("minus [값1] [값2]     빼기 계산을 수행한다. 예) App minus 100 200");

      } else {
        String[] values = input.split(" ");
        if (values[0].equals("add")) {
          if (values.length != 3) {
            System.out.println("명령어 입력형식이 옳지 않습니다.");
          } else {
            int v1 = Integer.parseInt(values[1]);
            int v2 = Integer.parseInt(values[2]);
            System.out.printf("%d + %d = %d \n", v1, v2, v1 + v2);
          }
        } else if (values[0].equals("minus")) {
          if (values.length != 3) {
            System.out.println("명령어 입력형식이 옳지 않습니다.");
          } else {
            int v1 = Integer.parseInt(values[1]);
            int v2 = Integer.parseInt(values[2]);
            System.out.printf("%d - %d = %d \n", v1, v2, v1 - v2);
          }
        } else {
          System.out.println("지원하지 않는 연산자 입니다.");
        }
      }
    }
    KeyScan.close();

  }
}
