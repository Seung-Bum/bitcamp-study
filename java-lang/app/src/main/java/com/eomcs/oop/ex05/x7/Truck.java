package com.eomcs.oop.ex05.x7;

public class Truck extends Car {

  int weight;

  @Override
  public void run() {
    this.launch();
  }

  public void dump() {
    System.out.println("짐을 내립니다.");
  }

  public void launch() {
    System.out.println("Truck은 launch");
  }
}
