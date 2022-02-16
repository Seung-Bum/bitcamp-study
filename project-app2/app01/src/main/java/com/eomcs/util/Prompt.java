package com.eomcs.util;

import java.util.Scanner;

public class Prompt {
  static Scanner KeyScan = new Scanner(System.in);

  // 가변인자를 사용하여 내부적으로 String format을 생성해서 전달한다.
  public static String promptString(String titleFormat, Object... args) {
    System.out.print(String.format(titleFormat, args));
    return KeyScan.nextLine();
  }

  public static int promptInt(String titleFormat, Object... args) {
    return Integer.parseInt(promptString(titleFormat, args));
  }
}
