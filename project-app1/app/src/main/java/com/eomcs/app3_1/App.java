package com.eomcs.app3_1;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    while(true) {

      System.out.print(">>> ");
      String input = scan.nextLine();
      String[] values = input.split(" ");

      if (input.equals("help")) {
        System.out.println("사용법 예시");
        System.out.println("add 100 200");
        System.out.println("minus 100 200");

      } else if(input.length() == 0) {
        continue;

      } else if(input.equals("exit")) {
        System.out.println("프로그램을 종료합니다.");
        break;

      } else {
        if (values[0].equals("add")) {
          if (values.length != 3) {
            System.out.println("입력이 잘못되었습니다.");
            continue;
          } 
          int v1 = Integer.parseInt(values[1]);
          int v2 = Integer.parseInt(values[2]);
          System.out.printf("%d + %d = %d \n", v1, v2, v1 + v2);

        } else if (values[0].equals("minus")){
          if (values.length != 3) {
            System.out.println("입력이 잘못되었습니다.");
            continue;
          }
          int v1 = Integer.parseInt(values[1]);
          int v2 = Integer.parseInt(values[2]);
          System.out.printf("%d - %d = %d \n", v1, v2, v1 - v2);
        }
      }
    }
    scan.close();
  }
}
