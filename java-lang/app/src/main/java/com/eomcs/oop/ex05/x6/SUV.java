package com.eomcs.oop.ex05.x6;

public class SUV extends Car {

  boolean enalbled4wd;

  @Override
  public void run() {
    if (enalbled4wd) {
      System.out.println("SUV RUN: 강력한 파워");
    } else {
      System.out.println("SUV RUN: 그냥 달림");
    }
  }

  public void active4wd(boolean enable) {
    this.enalbled4wd = enable;
  }

}
