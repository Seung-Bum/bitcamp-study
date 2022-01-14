package com.eomcs.oop.ex05.x6;

public class CarTest2 {

  public static void main(String[] args) {
    Sedan sedan = new Sedan();
    sedan.openedSunroof = true;
    testCar(sedan);

    System.out.println("-------------------");

    Truck truck = new Truck();
    testCar(truck);

    System.out.println("-------------------");

    SUV suv = new SUV();
    suv.active4wd(false);
    //    suv.active4wd(true);
    testCar(suv);
  }

  // Car만 들어올 수 있도록함
  static void testCar(Car car) {
    car.start();
    car.run();
    car.stop();
  }


}