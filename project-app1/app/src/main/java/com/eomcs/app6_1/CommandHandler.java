package com.eomcs.app6_1;

public class CommandHandler {

  void doHelp() {
    System.out.println("사용법 예시");
    System.out.println("add 100 200");
    System.out.println("minus 100 200");
  }

  void add(Command command) {
    int v1 = Integer.parseInt((String)command.params.get(1));
    int v2 = Integer.parseInt((String)command.params.get(2));
    System.out.printf("%d + %d = %d \n", v1, v2, v1 + v2);
  }

  void minus(Command command) {
    int v1 = Integer.parseInt((String)command.params.get(1));
    int v2 = Integer.parseInt((String)command.params.get(2));
    System.out.printf("%d - %d = %d \n", v1, v2, v1 - v2);
  }
}
