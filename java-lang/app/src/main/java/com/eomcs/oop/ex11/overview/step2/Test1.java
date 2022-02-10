package com.eomcs.oop.ex11.overview.step2;

public class Test1 {
  public static void main(String[] args) {

    MyList myList = new MyList();
    myList.add("홍길동");
    myList.add("임꺽정");
    myList.add("유관순");
    myList.add("안중근");
    myList.add("윤봉길");
    myList.add("김구");

    ListIterator iterator = new ListIterator(myList);
    while (iterator.hasNext()) { // 꺼낼게 있는지 물어본다.
      System.out.println(iterator.next()); // list 사이즈만큼 값을 가져온다.
    }
  }
}
