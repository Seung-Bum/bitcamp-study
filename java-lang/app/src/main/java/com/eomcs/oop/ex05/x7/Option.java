package com.eomcs.oop.ex05.x7;

public abstract class Option extends Car{
  // 보통 직접사용하는 것이 아니라 가져다 쓰기 때문에 추상메서드 설정
  // 데코레이터

  Car car; // 포함하는 객체 Car

  public Option(Car car) { // 옵션을 Car에 붙여야 의미가 있다.
    this.car = car;
  }

  @Override
  public void start() {
    // 데코레이터는 Car가 아니다.
    // 따라서 시동을 걸라고 요청이 들어오면
    // 실제 자동차 객체에(데코레이터를 붙인) Car에게 위임해야 한다.
    car.start();
  }

  @Override
  public void stop() {
    car.stop();
  }

}
