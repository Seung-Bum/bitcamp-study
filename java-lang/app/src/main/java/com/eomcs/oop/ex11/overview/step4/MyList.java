package com.eomcs.oop.ex11.overview.step4;

import java.util.Arrays;

public class MyList {

  Object[] arr = new Object[10];
  int size;

  public void add(Object obj) {
    if (size == arr.length) {
      arr = Arrays.copyOf(arr, arr.length + (arr.length >> 1));
    }
    arr[size++] = obj;
  }

  public Object get(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException();
    }
    return arr[index];
  }

  public int size() {
    return size;
  }

  public Object remove(int index) {
    if (index < 0 || index >= size) {
      throw new ArrayIndexOutOfBoundsException();
    }

    Object old = arr[index];

    for (int i = index; i < (size - 1); i++) {
      arr[i] = arr[i+1];
    }

    arr[--size] = null; // 배열의 크기를 줄이고, 마지막 항목에 들어 있는 값을 null로 초기화하여 객체의 레퍼런스를 줄인다.
    return old;
  }

  public Iterator iterator() {
    return new ListIterator(this);
  }

  // 중첩클래스
  static class ListIterator implements Iterator {

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
}













