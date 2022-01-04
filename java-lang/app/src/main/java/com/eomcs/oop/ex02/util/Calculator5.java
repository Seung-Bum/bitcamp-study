package com.eomcs.oop.ex02.util;

public class Calculator5 {
  int result = 0;

  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
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

  // 인스턴스 변수를 사용하지 않는다.
  static int abs(int a) {
    return a >= 0 ? a : a *-1;
  }
}

