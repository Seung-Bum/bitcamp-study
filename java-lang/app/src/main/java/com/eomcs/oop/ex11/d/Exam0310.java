// local class에서 바깥 메서드의 로컬 변수 접근
package com.eomcs.oop.ex11.d;

//계산기 사용법을 정의한다.
interface Calculator {
  double compute(int money);
}

class CalculatorFactory {
  static Calculator create(float interest) {
    class CalculatorImpl implements Calculator {

      @Override
      public double compute(int money) {
        return money +(money * interest);

      }
    }
    return new CalculatorImpl();
  }
}

public class Exam0310 {

  public static void main(String[] args) {
    Calculator c1 = CalculatorFactory.create(0.02f);
    Calculator c2 = CalculatorFactory.create(0.08f);

    System.out.printf("%.2f\n", c1.compute(1235_0000));
    System.out.printf("%.2f\n", c2.compute(1235_0000));
  }

}
