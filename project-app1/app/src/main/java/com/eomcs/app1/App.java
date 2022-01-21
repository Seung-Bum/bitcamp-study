/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.eomcs.app1;

public class App {

  public static void main(String[] args) {
    java.util.Scanner keyScan = new java.util.Scanner(System.in);

    System.out.print(">>>");
    String in = keyScan.nextLine();

    if (in.equals("help")) {
      System.out.println("사용법");
      System.out.println("App [명령] [값1] [값2]");
      System.out.println("명령:");
      System.out.println("add [값1] [값2]    더하기 계산을 수행한다. 예) App add 100 200");
      System.out.println("add [값1] [값2]    빼기 계산을 수행한다.   예) App minus 100 200");
      return;
    }

    if (in.equals("add")) { // string이 오버라이드해서 같은 값인지 해석 가능
      int v1 = Integer.parseInt(args[1]);
      int v2 = Integer.parseInt(args[2]);
      System.out.printf("%d  +  %d = %d",v1, v2, Calculator.add(v1, v2));
    } 

    if (in.equals("minus")) {
      int v1 = Integer.parseInt(args[1]);
      int v2 = Integer.parseInt(args[2]);
      System.out.printf("%d  -  %d = %d",v1, v2, Calculator.minus(v1, v2));
    } 

  }
}
