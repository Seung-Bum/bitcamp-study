package com.eomcs.oop.ex11.overview.step4;

public class MyQueue extends MyList {

  public void offer(Object obj) {
    this.add(obj);
  }

  public Object poll() {
    if (size == 0) {
      return null;
    }
    return remove(0);
  }

  @Override
  public Iterator iterator() {
    return new QueueIterator(this); // this = MyQueue
  }


  // 강사님 코드
  // 중첩클래스
  static class QueueIterator implements Iterator {

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
}











