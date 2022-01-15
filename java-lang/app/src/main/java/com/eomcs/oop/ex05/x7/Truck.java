package com.eomcs.oop.ex05.x7;

public class Truck extends Car{

  int weight;

  // 기존에 있는 메서드 호출한다.
  @Override
  public void run() {
    this.go();
  }

  @Override
  public void start() {
    this.lanuch();
  }

  @Override
  public void stop() {
    this.stopping();
  }

  // 과거 메서드(레거시)
  public void lanuch() {
    System.out.println("시동 스타트"); 
  }

  public void stopping() {
    System.out.println("시동 스탑");
  }

  public void go() {
    System.out.println("Truck 고고고");
  }

  public void dump() {
    System.out.println("DUMP: 짐을 내린다.");
  }

}
