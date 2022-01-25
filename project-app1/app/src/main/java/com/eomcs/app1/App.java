/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.eomcs.app1;

public class App {

  public static void main(String[] args) {
    java.util.Scanner keyScan = new java.util.Scanner(System.in);

    while (true) {
      System.out.print(">>>");
      String in = keyScan.nextLine();

      if (in.equals(" ")) {
        continue;
      }

      if (in.equals("break")) {
        keyScan.close();
        break;
      }

      if (in.equals("help")) {
        System.out.println("사용법");
        System.out.println("App [명령] [값1] [값2]");
        System.out.println("명령:");
        System.out.println("add [값1] [값2]    더하기 계산을 수행한다. 예) add 100 200");
        System.out.println("add [값1] [값2]    빼기 계산을 수행한다.   예) minus 100 200");
        return;
      }

      if (in.equals("add")) { // string이 오버라이드해서 같은 값인지 해석 가능
        System.out.println("숫자를 한번씩 입력해주세요!");
        int v1 = keyScan.nextInt();
        int v2 = keyScan.nextInt();
        System.out.printf("%d  +  %d = %d",v1, v2, Calculator.add(v1, v2));
      } 

      if (in.equals("minus")) {
        System.out.println("숫자를 한번씩 입력해주세요!");
        int v1 = keyScan.nextInt();
        int v2 = keyScan.nextInt();
        System.out.printf("%d  -  %d = %d",v1, v2, Calculator.minus(v1, v2));
      }
    }

  }
}