package com.eomcs.oop.ex05.x4.app1;

// 자동차를 만들기
//
public class CarTest1 {

  public static void main(String[] args) {
    // Engine 클래스에 시동걸고 끄는 기능을 추가한다.
    Car car = new Car();
    car.start();
    car.run();
    car.stop();

  }


}
