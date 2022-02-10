package com.eomcs.oop.ex11.overview.step2;

// MyQueue 컬렉션에서 데이터를 꺼내는 일을 한다.
// 
public class QueueIterator implements Iterator {

  MyQueue Queue;

  public QueueIterator(MyQueue Queue) {
    this.Queue = Queue;
  }

  @Override
  public boolean hasNext() {
    return Queue.size() > 0;
  }

  @Override
  public Object next() {
    return Queue.poll();
  }
}
