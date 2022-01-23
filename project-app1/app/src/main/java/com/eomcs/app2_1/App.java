package com.eomcs.app2_1;

public class App {
  public static void main(String[] args) {

    if (args.length == 0) {
      System.out.println("명령을 입력해 주세요");
      System.out.println("사용법");
      System.out.println("add 100 200");
      System.out.println("minus 100 200");

    } else if (args[0].equals("add")) {
      if (args.length != 3) {
        System.out.println("입력이 잘못되었습니다.");
        return;
      }
      int v1 = Integer.parseInt(args[1]);
      int v2 = Integer.parseInt(args[2]);
      System.out.printf("%d + %d = %d", v1, v2, v1 + v2);

    } else if (args[0].equals("minus")) {
      if (args.length != 3) {
        System.out.println("입력이 잘못되었습니다.");
        return;
      }
      int v1 = Integer.parseInt(args[1]);
      int v2 = Integer.parseInt(args[2]);
      System.out.printf("%d - %d = %d", v1, v2, v1 - v2);
    }


  }
}
