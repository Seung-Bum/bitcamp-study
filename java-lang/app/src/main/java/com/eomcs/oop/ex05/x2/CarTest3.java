package com.eomcs.oop.ex05.x2;

// 캠핑카 만들기
public class CarTest3 {

  CampingTrailer trailer = new CampingTrailer();

  public static void main(String[] args) {
    // Engine 클래스에 시동걸고 끄는 기능을 추가한다.

    CampingTrailer trailer = new CampingTrailer();
    System.out.println(trailer); //com.eomcs.oop.ex05.x2.app1.CampingTrailer@6ce253f1 => not null
    //    trailer = null;

    Engine car = new Engine();

    car.setTrailer(trailer);
    car.start();
    car.run();
    car.dump();
    car.stop();

  }



}
