package com.eomcs.oop.ex05.x1.test5;

public class Calculator2  {

  // plus(), minus(),는 기존 Calculator 클래스에게 위임한다.
  com.eomcs.oop.ex05.x1.test1.Calculator origin = new com.eomcs.oop.ex05.x1.test1.Calculator ();

  public void plus(int value) {
    origin.plus(value);
  }
  public void minus(int value) {
    origin.minus(value);
  }

  // 새 기능 또한 기존 객체의 필드를 사용하여 처리한다.
  public void multiple(int value) {
    origin.result *= value;
  }

  public int getResult() {
    return origin.result;
  }
}
