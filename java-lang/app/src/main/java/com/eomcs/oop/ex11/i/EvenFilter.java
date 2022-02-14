package com.eomcs.oop.ex11.i;

public class EvenFilter implements Filter {
  // Filter 인터페이스 구현 
  @Override
  public boolean accept(int value) {
    return (value % 2) == 0;
  }

}
