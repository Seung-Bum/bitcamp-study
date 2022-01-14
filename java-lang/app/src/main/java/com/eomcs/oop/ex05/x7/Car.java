package com.eomcs.oop.ex05.x7;

public abstract class Car {

  boolean auto;
  int cc;
  int valve;

  public void start() {
    System.out.println("시동 부릉부릉");
  }

  public void stop() {
    System.out.println("시동 꺼짐");
  }

  public abstract void run();

}
