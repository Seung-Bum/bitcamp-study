package com.eomcs.app5_1;

import java.util.Scanner;

public class App {

  static Scanner scan = new Scanner(System.in);

  public static void main(String[] args) {

    while(true) {

      String input = prompt();
      String[] values = input.split(" ");
      Command command = new Command(values);

      if (command.getName().equals("help")) {
        doHelp();

      } else if(command.getName() == "") {
        continue;

      } else if(command.getName().equals("exit")) {
        System.out.println("프로그램을 종료합니다.");
        break;

      } else {
        if (command.getPramSize() != 3) {
          System.out.println("입력이 잘못되었습니다.");

        } else if (command.getName().equals("add")) {
          add(command);

        } else if (command.getName().equals("minus")){
          minus(command);

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

  static void add(Command command) {
    int v1 = Integer.parseInt((String)command.params.get(1));
    int v2 = Integer.parseInt((String)command.params.get(2));
    System.out.printf("%d + %d = %d \n", v1, v2, v1 + v2);
  }

  static void minus(Command command) {
    int v1 = Integer.parseInt((String)command.params.get(1));
    int v2 = Integer.parseInt((String)command.params.get(2));
    System.out.printf("%d - %d = %d \n", v1, v2, v1 - v2);
  }

}
