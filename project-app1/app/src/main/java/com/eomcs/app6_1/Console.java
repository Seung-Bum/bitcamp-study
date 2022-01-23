package com.eomcs.app6_1;

import java.util.Scanner;

public class Console {
  Scanner scan = new Scanner(System.in);

  String prompt() {
    System.out.print(">>> ");
    String input = scan.nextLine();
    return input;
  }

  void close() {
    scan.close();
  } 
}
