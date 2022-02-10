package com.eomcs.oop.ex11.overview.step4;

import java.util.EmptyStackException;

public class MyStack extends MyList {

  public void push(Object obj) {
    this.add(obj);
  }

  public Object pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    return remove(size - 1);
  }

  // 상속받은 메서드 중에서 서브클래스의 목적에 맞게 재정의함
  @Override
  public Iterator iterator() {
    return new StackIterator(this);
  }

  // 강사님 코드
  // 중첩클래스
  static class StackIterator implements Iterator {

    MyStack stack;

    public StackIterator(MyStack stack) {
      this.stack = stack;
    }

    @Override
    public boolean hasNext() {
      return stack.size() > 0;
    }

    @Override
    public Object next() {
      return stack.pop();
    }
  }


}
