package com.eomcs.app6;

import java.util.Arrays;
import java.util.Scanner;

public class Console {

  Scanner keyScan = new Scanner(System.in);

  Command prompt() {
    System.out.println(">>>");
    String[] values = keyScan.nextLine().split(" ");
    return new Command(values[0], Arrays.copyOfRange(values, 1, values.length));
  }

  void close() {
    keyScan.close();
  }

}
