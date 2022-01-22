package com.eomcs.app5;

import java.util.Arrays;
import java.util.Scanner;

public class App {

  static Scanner KeyScan = new Scanner(System.in);

  public static void main(String[] args) {

    while (true) {
      Command command = prompt();

      if (command.getName().equals("exit") || command.getName().equals("quit")) {
        break;

      } else if (command.getName().equals("")) { // else if는 위에서 조건이 안맞으면 멈춘다.
        continue;

      } else if (command.getName().equals("help")) {
        doHelp();

      } else if (command.getName().equals("add")) {
        doAdd(command); 

      } else if (command.getName().equals("minus")) {
        doMinus(command);

      } else {
        System.out.println("지원하지 않는 연산자 입니다.");
      }
    }
    KeyScan.close();
  }


  static void doHelp() {
    System.out.println("사용법:");
    System.out.println("App [명령] [값1] [값2]");
    System.out.println("명령:");
    System.out.println("add   [값1] [값2]     더하기 계산을 수행한다. 예) App add 100 200");
    System.out.println("minus [값1] [값2]     빼기 계산을 수행한다. 예) App minus 100 200");
  }

  static void doAdd(Command command) {
    if (command.getParamSize() != 2) {
      System.out.println("명령어 입력형식이 옳지 않습니다.");
    } else {
      int v1 = command.getInt(0);
      int v2 = command.getInt(1);
      System.out.printf("%d + %d = %d \n", v1, v2, v1 + v2);
    }
  }

  static void doMinus(Command command) {
    if (command.getParamSize() != 2) {
      System.out.println("명령어 입력형식이 옳지 않습니다.");
    } else {
      int v1 = command.getInt(0);
      int v2 = command.getInt(1);
      System.out.printf("%d - %d = %d \n", v1, v2, v1 - v2);
    }
  }

  static Command prompt() {
    System.out.println(">>>");
    String[] values = KeyScan.nextLine().split(" ");
    return new Command(values[0], Arrays.copyOfRange(values, 1, values.length));
  }

}
