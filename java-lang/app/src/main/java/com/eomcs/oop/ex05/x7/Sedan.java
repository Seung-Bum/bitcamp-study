package com.eomcs.oop.ex05.x7;

public class Sedan extends Car {

  boolean auto;
  boolean stateSunroof;

  @Override
  public void run() {
    System.out.println("Sedan 출발");
  }

  public void Sunroof() {
    if(stateSunroof) {
      System.out.println("Sunroof 열림");
    } else {
      System.out.println("Sunroof 닫힘");
    }
  }

}
