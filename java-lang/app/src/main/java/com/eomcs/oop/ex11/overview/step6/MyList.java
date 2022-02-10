package com.eomcs.oop.ex11.overview.step6;

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


  // 1번만함
  public Iterator iterator() {

    // 로컬 클래스
    class ListIterator implements Iterator {

      int cursor;

      @Override
      public boolean hasNext() {
        return cursor < MyList.this.size();
      }

      @Override
      public Object next() {
        return MyList.this.get(cursor++);
      }
    }
    return new ListIterator();
  }



}











