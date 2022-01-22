package com.eomcs.app6;

public class App {

  public static void main(String[] args) {

    Console console = new Console();
    CommandHandler commandHandler = new CommandHandler();

    while (true) {
      Command command = console.prompt();

      if (command.getName().equals("exit") || command.getName().equals("quit")) {
        break;

      } else if (command.getName().equals("")) { // else if는 위에서 조건이 안맞으면 멈춘다.
        continue;

      } else if (command.getName().equals("help")) {
        commandHandler.doHelp();

      } else if (command.getName().equals("add")) {
        commandHandler.doAdd(command); 

      } else if (command.getName().equals("minus")) {
        commandHandler.doMinus(command);

      } else {
        System.out.println("지원하지 않는 연산자 입니다.");
      }
    }
  }

}
