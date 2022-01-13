package com.eomcs.oop.ex05.x3.app4;

public class CarTest4 {

  // 기존 코드를 복제해 온 후 하이브리드 기능 덧 붙이기

  public static void main(String[] args) {

    Engine car = new Engine();

    car.chargeBattery(100);
    car.start();
    car.run();
    car.stop();

  }

}
