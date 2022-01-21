// Wrapper 클래스 - wrapper 객체의 값 비교
package com.eomcs.basic.ex02;

public class Exam0232 {
  public static void main(String[] args) {
    // wrapper 객체에 대해 == 연산자를 사용할 때 주의할 점
    // 강사님 주석

    Integer obj1 = 100;
    Integer obj2 = 100;
    System.out.println(obj1 == obj2);

    Integer obj3 = 200;
    Integer obj4 = 200;
    System.out.println(obj3 == obj4);


  }
}


