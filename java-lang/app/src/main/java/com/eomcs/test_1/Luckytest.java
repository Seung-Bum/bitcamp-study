package com.eomcs.test_1;

import java.util.Random;

public class Luckytest {
  public static void main(String[] args) {
    luckytest();
  }

  private static void luckytest() {
    String[] jebi = {"김지현", "한상은", "김규범", "양성은", "김주은", "양승범"};
    Random rnd = new Random();
    int id = rnd.nextInt(jebi.length); // 0~n 미만의 정수형 난수 반환
    System.out.println(jebi[id]);
  }

}
