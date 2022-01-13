package com.eomcs.oop.ex05.x4.app3;


public class CarTest3 {

  public static void main(String[] args) {
    // 트레일러 클래스 추가

    CampingTrailer trailer = new CampingTrailer();
    System.out.println(trailer); //com.eomcs.oop.ex05.x2.app1.CampingTrailer@6ce253f1 => not null
    //    trailer = null;

    TrailerCar car = new TrailerCar();

    car.setTrailer(trailer);
    car.start();
    car.run();
    car.stop();

  }



}
