package com.eomcs.oop.ex05.x7;

public class CarTest3 {

  public static void main(String[] args) {
    Sedan sedan = new Sedan();
    SnowChain snowchain = new SnowChain(sedan);
    testCar(snowchain);

    System.out.println("--------------------------");

    Truck truck = new Truck();
    BlackBox blackbox = new BlackBox(truck);
    testCar(blackbox);

    System.out.println("--------------------------");

    SUV suv = new SUV();
    suv.active4wd(true);
    BlackBox blackboxSUV = new BlackBox(suv);
    SnowChain snowchainSUV = new SnowChain(blackboxSUV);
    testCar(snowchainSUV);

  }
  // 순서가 필요한 데코레이터도 있음 3D영화관 안경같은

  // Car만 들어올 수 있도록함
  static void testCar(Car car) {
    car.start();
    car.run();
    car.stop();
  }


}