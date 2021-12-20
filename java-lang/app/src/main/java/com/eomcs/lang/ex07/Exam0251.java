package com.eomcs.lang.ex07;

// # 메서드 : 가변 파라미터
//
public class Exam0251 {

  // 가변 파라미터
  // 기본 배열을 그대로 사용할까? 아니면 파라미터로 받은 배열을 복제해서 사용할까?
  // => 가변 파라미터에 배열을 넘길 경우 그 배열을 그대로 받아 사용한다.

  // 다음은 hello()를 호출할 때 String 값을 0개 이상 전달할 수 있다.
  static void hello(String... names) {
    for (int i = 0; i < names.length; i++) {
      names[i] += "^^";
      System.out.printf("%s님 반갑습니다.\n", names[i]);
    }
  }

  public static void main(String[] args) {

    String[] arr = {"김구", "안중근", "윤봉길", "유관순"};

    // 가변 파라미터에 배열을 넘길 경우
    hello(arr);
    System.out.println("-------------------");

    for (String value : arr) {
      System.out.println(value);
    }
  }
}
