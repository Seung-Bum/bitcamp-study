package com.eomcs.oop.ex05.x6;

public class SnowChain extends Option {
  // Option은 기본 생성자가 없다.  
  // 반드시 Car를 달라고 요구함

  // 생성자: constructor
  public SnowChain(Car car) {
    super(car);
  }

  @Override
  public void run() {
    System.out.println("도로 마찰력을 증가시킨다.");
    car.run();
  }

}
