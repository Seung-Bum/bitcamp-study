package com.eomcs.oop.ex05.x2;

// 트럭 만들기
public class CarTest2 {

  public static void main(String[] args) {
    // Engine 클래스에 시동걸고 끄는 기능을 추가한다.
    Engine car = new Engine();
    car.start();
    car.run();
    car.dump();
    car.stop();

  }



}
