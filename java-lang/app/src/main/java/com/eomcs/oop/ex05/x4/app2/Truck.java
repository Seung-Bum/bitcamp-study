package com.eomcs.oop.ex05.x4.app2;

// 기존 소스 재사용
import com.eomcs.oop.ex05.x4.app1.Car;

public class Truck  extends Car {
  // 트럭 기능 추가
  public void dump() {
    System.out.println("dump!");
  }
}
