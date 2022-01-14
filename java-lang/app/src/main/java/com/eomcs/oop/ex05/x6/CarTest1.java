package com.eomcs.oop.ex05.x6;

public class CarTest1 {

  public static void main(String[] args) {
    Sedan sedan = new Sedan();
    testSedan(sedan);

    System.out.println("-------------------");

    Truck truck = new Truck();
    testTruck(truck);
  }

  static void testSedan(Sedan car) {
    car.start();
    car.run();
    car.stop();
  }

  // 기존의 트럭 메서드는 사용할 수 없다.
  // 
  static void testTruck(Truck car) {
    car.start();
    car.run();
    car.stop();
  }

}