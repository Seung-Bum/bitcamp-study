package com.eomcs.oop.ex05.x7;

public class SUV extends Car {

  boolean enabled4wd;

  @Override
  public void run() {
    System.out.println("SUV 출발");
  }

  public void active4wd() {
    if(enabled4wd) {
      System.out.println("강력한 SUV 출발");
    } else {
      this.run();
    }
  }

}
