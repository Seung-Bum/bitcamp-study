package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Calculator4;

// # 관련된 기능(메서드)을 묶어 분류하기 : 분류 전
//
public class ExamTest5 {

  public static void main(String[] args) {
    // 다음 식을 연산자 우선 순위를 고려하지 않고 순서대로 계산하라!
    // 2 + 3 - 1 * 7 / 3 = ?

    Calculator4 c1 = new Calculator4();
    Calculator4 c2 = new Calculator4();

    c1.plus(2);
    c1.plus(3);
    c1.minus(1);
    c1.multiple(7);
    c1.divide(3);

    c2.plus(2);
    c2.plus(3);
    c2.minus(1);
    c2.multiple(7);
    c2.divide(3);

    System.out.printf("c1.result = %d\n", c1.getResult());
    System.out.printf("c2.result = %d\n", c2.getResult());
  }

}


