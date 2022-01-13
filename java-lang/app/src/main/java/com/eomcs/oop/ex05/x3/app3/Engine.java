package com.eomcs.oop.ex05.x3.app3;

public class Engine {
  int cc;
  int valve;

  public void run() {
    if (trailer == null) {
      // 트레일러 장착 기능이 추가되었다면 다음과 같이 run() 메서드를 변경해야한다.
      System.out.println("씽쌍 달린다.");
    } else {
      System.out.println("느릿 느릿 조심히 움직인다!");
    }
  }

  public void start() {
    System.out.println("시동 켠다.");
  }

  public void stop() {
    System.out.println("시동 끈다.");
  }

  // 트레일러 붙이는 기능 추가
  CampingTrailer trailer;
  public void setTrailer(CampingTrailer trailer) {
    this.trailer = trailer;
  }
}