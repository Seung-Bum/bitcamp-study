// 다형성 - 다형적 변수와 형변환(type casting) II
package com.eomcs.oop.ex06.a;

public class Exam0310 {

  public static void main(String[] args) {

    Car c = new Car();
    Car c1 = new Sedan();

    c.model = "티코"; // Vehicle의 인스턴스 변수
    c.capacity = 5;  // Vehicle의 인스턴스 변수
    c.cc = 890;      // Car의 인스턴스 변수 -> 하위인 Sedan을 사용 할 수 없다.
    c.valve = 16;    // Car의 인스턴스 변수 -> 하위인 Sedan을 사용 할 수 없다.

    c1.model = "마티즈"; // Vehicle의 인스턴스 변수
    c1.capacity = 5;  // Vehicle의 인스턴스 변수
    c1.cc = 890;      // Sedan의 인스턴스 변수  
    c1.valve = 16;    // Sedan의 인스턴스 변수 
    // -> 타입이 car라서 car인스턴스에만 접근가능하지만 sedan으로 형변환시
    //    sedan인스턴스에도 접근가능하다.

    // 잘못된 형변환을 할 경우, 
    // => 형변환(type casting)으로 컴파일러를 속일 수는 있지만,
    //    실행할 때 오류가 발생할 것이다.
    // => 속이지 말라!
    Sedan s = (Sedan) c; // 실행할 때 오류 발생! (runtime exception)
    s.sunroof = true;
    s.auto = true;

    Sedan s1 = (Sedan) c1; // 실행시 오류 발생 안함, 정상작동
    s1.sunroof = true;
    s1.auto = true;

  }

}










