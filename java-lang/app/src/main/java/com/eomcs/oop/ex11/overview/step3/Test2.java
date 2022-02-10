package com.eomcs.oop.ex11.overview.step3;

public class Test2 {
  public static void main(String[] args) {
    MyStack myStack = new MyStack();
    myStack.push("홍길동");
    myStack.push("임꺽정");
    myStack.push("유관순");
    myStack.push("안중근");
    myStack.push("윤봉길");
    myStack.push("김구");

    Iterator iterator = myStack.iterator(); // 값 조회할 iterator줘봐 
    while (iterator.hasNext()) { // 꺼낼게 있는지 물어본다.
      System.out.println(iterator.next()); // list 사이즈만큼 값을 가져온다.
    }
  }
}
