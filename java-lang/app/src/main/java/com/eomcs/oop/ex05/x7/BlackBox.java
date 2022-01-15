package com.eomcs.oop.ex05.x7;

public class BlackBox extends Option {

  // 스스로 존재할 수 없음 Car객체를 받아야함
  public BlackBox(Car car) {
    super(car);
  }

  // 자기가 갖고 있는 메서드가 아님 들어오는 객체에 붙임
  @Override
  public void run() {
    car.run();
  }

  @Override
  public void start() {
    super.start();
    System.out.println("녹화 시작!");
  }

  @Override
  public void stop() {
    super.stop();
    System.out.println("녹화 종료!");
  }
}
