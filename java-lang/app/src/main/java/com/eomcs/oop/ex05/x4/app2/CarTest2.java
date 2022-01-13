package com.eomcs.oop.ex05.x4.app2;

// 트럭 만들기

// 복사해온 Engine 기능에 기능 덧붙이기
public class CarTest2 {

  public static void main(String[] args) {
    // Car 클래스 상속 

    Truck car = new Truck();
    car.start();
    car.run();
    car.dump();
    car.stop();

  }

}
