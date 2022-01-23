package com.eomcs.app4_1;

import java.util.Scanner;

public class App {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    while(true) {

      String input = prompt();
      String[] values = input.split(" ");

      if (input.equals("help")) {
        doHelp();

      } else if(input == "") {
        continue;

      } else if(input.equals("exit")) {
        System.out.println("프로그램을 종료합니다.");
        break;

      } else {
        if (values.length != 3) {
          System.out.println("입력이 잘못되었습니다.");

        } else if (values[0].equals("add")) {
          add(values);

        } else if (values[0].equals("minus")){
          minus(values);

        }
      }
    }
    scan.close();
  }


  // Method
  static void doHelp() {
    System.out.println("사용법 예시");
    System.out.println("add 100 200");
    System.out.println("minus 100 200");
  }

  static String prompt() {
    System.out.print(">>> ");
    String input = scan.nextLine();
    return input;
  }

  static void add(String[] values) {
    int v1 = Integer.parseInt(values[1]);
    int v2 = Integer.parseInt(values[2]);
    System.out.printf("%d + %d = %d \n", v1, v2, v1 + v2);
  }

  static void minus(String[] values) {
    int v1 = Integer.parseInt(values[1]);
    int v2 = Integer.parseInt(values[2]);
    System.out.printf("%d - %d = %d \n", v1, v2, v1 - v2);
  }

}
