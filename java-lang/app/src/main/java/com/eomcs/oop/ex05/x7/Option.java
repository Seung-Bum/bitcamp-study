package com.eomcs.oop.ex05.x7;

// 데코레이터
public abstract class Option extends Car {

  // Car에게 일을 위임시키기 위해 포함설정
  Car car;

  public Option(Car car) {
    this.car = car;
  }

  //  @Override
  //  public void start() {
  //    // 데코레이터는 Car가 아니다.
  //    // 따라서 시동을 걸라고 요청이 들어오면
  //    // 실제 자동차 객체에(데코레이터를 붙인) Car에게 위임해야 한다.
  //    car.start();
  //  }
  //
  //  @Override
  //  public void stop() {
  //    car.stop();
  //  }

}
