package com.eomcs.oop.ex11.overview.step3;

public class Test3 {
  public static void main(String[] args) {
    MyQueue myQueue = new MyQueue();
    myQueue.offer("홍길동");
    myQueue.offer("임꺽정");
    myQueue.offer("유관순");
    myQueue.offer("안중근");
    myQueue.offer("윤봉길");
    myQueue.offer("김구");

    Iterator iterator = myQueue.iterator(); // 값 조회할 iterator줘봐 
    while (iterator.hasNext()) { // 꺼낼게 있는지 물어본다.
      System.out.println(iterator.next()); // list 사이즈만큼 값을 가져온다.
    }
  }
}
