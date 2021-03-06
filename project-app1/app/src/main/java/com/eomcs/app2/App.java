package com.eomcs.app2;

public class App {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("사용법:");
      System.out.println("App [명령] [값1] [값2]");
      System.out.println("명령:");
      System.out.println("add   [값1] [값2]     더하기 계산을 수행한다. 예) App add 100 200");
      System.out.println("minus [값1] [값2]     빼기 계산을 수행한다. 예) App minus 100 200");
      return;
    }

    if (args[0].equals("add")) {
      int v1 = Integer.parseInt(args[1]);
      int v2 = Integer.parseInt(args[2]);
      System.out.printf("%d + %d = %d\n", v1, v2, (v1 + v2));

    } else if (args[0].equals("minus")) {
      int v1 = Integer.parseInt(args[1]);
      int v2 = Integer.parseInt(args[2]);
      System.out.printf("%d - %d = %d\n", v1, v2, (v1 - v2));
    }
  }
}
