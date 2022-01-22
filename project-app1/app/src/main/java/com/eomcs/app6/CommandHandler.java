package com.eomcs.app6;

public class CommandHandler {

  void doHelp() {
    System.out.println("사용법:");
    System.out.println("App [명령] [값1] [값2]");
    System.out.println("명령:");
    System.out.println("add   [값1] [값2]     더하기 계산을 수행한다. 예) App add 100 200");
    System.out.println("minus [값1] [값2]     빼기 계산을 수행한다. 예) App minus 100 200");
  }

  void doAdd(Command command) {
    if (command.getParamSize() != 2) {
      System.out.println("명령어 입력형식이 옳지 않습니다.");
    } else {
      int v1 = command.getInt(0);
      int v2 = command.getInt(1);
      System.out.printf("%d + %d = %d \n", v1, v2, v1 + v2);
    }
  }

  void doMinus(Command command) {
    if (command.getParamSize() != 2) {
      System.out.println("명령어 입력형식이 옳지 않습니다.");
    } else {
      int v1 = command.getInt(0);
      int v2 = command.getInt(1);
      System.out.printf("%d - %d = %d \n", v1, v2, v1 - v2);
    }
  }

}
