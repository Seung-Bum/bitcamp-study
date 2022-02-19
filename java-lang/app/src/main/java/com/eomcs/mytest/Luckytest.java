package com.eomcs.mytest;

import java.util.Random;

public class Luckytest {
  public static void main(String[] args) {
    luckytest();
  }

  private static void luckytest() {
    String[] jebi = {"행운", "좋음", "보통", "조심", "나쁨"};
    Random rnd = new Random();
    int id = rnd.nextInt(jebi.length); // 0~n 미만의 정수형 난수 반환
    System.out.println(jebi[id]);
  }

}
