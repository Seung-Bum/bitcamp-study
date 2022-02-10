package com.eomcs.oop.ex11.overview.step3;

// MyList 컬렉션에서 데이터를 꺼내는 일을 한다.
// 
public class ListIterator implements Iterator {

  MyList list;
  int cursor; // 꺼낼 위치를 저장

  public ListIterator(MyList list) {
    this.list = list;
  }

  // 꺼낼게 있는지 없는지 물어보기
  @Override
  public boolean hasNext() { // 꺼낼게 있을때 까지 꺼낸다.
    return cursor < list.size();
  }

  // 꺼낼게 있는지 물어보고 있으면 next()를 통해서 꺼낸다.
  @Override
  public Object next() {
    return list.get(cursor++);
  }
}
