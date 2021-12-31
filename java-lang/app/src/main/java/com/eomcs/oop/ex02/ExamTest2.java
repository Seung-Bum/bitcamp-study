package com.eomcs.oop.ex02;

import com.eomcs.oop.ex02.util.Calculator2;
//Calculator 클래스를 향후 유지보수하기 쉽도록 별도의 패키지로 분류한다.
// - com.eomcs.oop.ex02.util 패키지를 만들어 분류한다.
// - import 를 이용하여 클래스의 패키지 정보를 지정한다.

public class ExamTest2 {

  public static void main(String[] args) {
    // 다음 식을 연산자 우선 순위를 고려하지 않고 순서대로 계산하라!
    // 2 + 3 - 1 * 7 / 3 = ?

    Calculator2 c1 = new Calculator2();// 식1의 계산 결과를 보관할 메모리 준비
    Calculator2 c2 = new Calculator2();// 식2의 계산 결과를 보관할 메모리 준비

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

    System.out.printf("result c1= %d\n", c1.result);
    System.out.printf("result c2= %d\n", c2.result);
  }

}