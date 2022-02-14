package com.eomcs.oop.ex11.i;

import java.util.Arrays;

public class List {
  int[] values;

  public List(int[] arr) {
    values = arr;
  }

  public int[] toArray(Filter filter) {
    int[] temp = new int[values.length]; // values크기와 같은 temp 생성
    int count = 0;

    for (int i = 0; i < values.length; i++) {
      if (filter.accept(values[i])) {
        temp[count++] = values[i]; // 짝수인 값만 temp에 저장
      }
    }
    return Arrays.copyOf(temp, count); // temp의 값들이 conut까지 int배열로 리턴
  }
}
