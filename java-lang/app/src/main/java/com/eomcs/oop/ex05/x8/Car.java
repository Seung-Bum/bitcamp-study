package com.eomcs.oop.ex05.x8;

public abstract class Car {
  int cc;
  int valve;

  public void start() {
    System.out.println("시동 스타트"); 
  }

  public void stop() {
    System.out.println("시동 스탑");
  }

  public abstract void run();

}
