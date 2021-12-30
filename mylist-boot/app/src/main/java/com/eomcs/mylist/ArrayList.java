package com.eomcs.mylist;

public class ArrayList {

  // 인스턴스 필드
  // => 인스턴스 필드는 new 명령을 통해 생성한다.
  Object[] list = new Object[5];
  int size = 0;

  void add(Object obj) {
    if (this.size == this.list.length) { 
      this.list = this.grow();
    }
    this.list[this.size++] = obj;
  }

  Object[] grow() {
    Object[] arr = new Object[this.newLength()];
    this.copy(arr);
    return arr;
  }

  int newLength() {
    return this.list.length + (this.list.length >> 1);
  }

  void copy(Object[] target) {
    int length = this.list.length;
    if (target.length < this.list.length) {
      length = target.length;
    }
    for (int i = 0; i < length; i++) {
      target[i] = this.list[i];
    }
  }

  Object[] toArray() {
    Object[] arr = new Object[this.size]; 
    for (int i = 0; i < this.size; i++) { 
      arr[i] = this.list[i]; 
    }
    return arr; 
  }

  Object remove(int index) {
    if (index < 0 || index >= this.size) { // 값이 저장된 위치가 무효한 인덱스라면 
      return null;
    }
    Object old = this.list[index];
    for (int i = index + 1; i < this.size; i++) {
      this.list[i - 1] = this.list[i];
    }
    this.size--;
    return old;
  }

  Object set(int index, Object obj) {
    if (index < 0 || index >= this.size) { // 값이 저장된 위치가 무효한 인덱스라면 
      return null;
    }
    Object old = this.list[index];
    this.list[index] = obj;
    return old;
  }
}










