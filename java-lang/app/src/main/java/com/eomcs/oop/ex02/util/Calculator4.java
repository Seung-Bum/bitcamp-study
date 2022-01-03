package com.eomcs.oop.ex02.util;

public class Calculator4 {

  int result = 0;

  public int getResult() {
    return result;
  }

  public void plus(int value) {
    this.result += value;
  }

  public void minus(int value) {
    this.result -= value;
  }

  public void multiple(int value) {
    this.result *= value;
  }

  public void divide(int value) {
    this.result /= value;
  }

  public static int abs(int a) {
    return a >= 0 ? a : a * -1;
  }
}

