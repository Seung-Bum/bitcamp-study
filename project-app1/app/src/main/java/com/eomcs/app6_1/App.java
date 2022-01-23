package com.eomcs.app6_1;

public class App {

  static CommandHandler commandHandler = new CommandHandler();
  static Console console = new Console();

  public static void main(String[] args) {

    while(true) {

      String input = console.prompt();
      String[] values = input.split(" ");
      Command command = new Command(values);

      if (command.getName().equals("help")) {
        commandHandler.doHelp();

      } else if(command.getName() == "") {
        continue;

      } else if(command.getName().equals("exit")) {
        System.out.println("프로그램을 종료합니다.");
        break;

      } else {
        if (command.getPramSize() != 3) {
          System.out.println("입력이 잘못되었습니다.");

        } else if (command.getName().equals("add")) {
          commandHandler.add(command);

        } else if (command.getName().equals("minus")){
          commandHandler.minus(command);

        }
      }
    }
  }
}
