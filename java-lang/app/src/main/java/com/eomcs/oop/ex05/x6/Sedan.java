package com.eomcs.oop.ex05.x6;

public class Sedan extends Car {

  boolean openedSunroof;
  boolean auto;

  @Override
  public void run() {
    System.out.println("Sedan 부릉부릉");
  }

  public void openSunroof() {
    System.out.println("OPEN");
    this.openedSunroof = true;
  }

  public void closeSunroof() {
    System.out.println("CLOSE");
    this.openedSunroof = false;
  }

}
