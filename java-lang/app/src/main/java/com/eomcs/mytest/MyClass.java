package com.eomcs.mytest;

public class MyClass {

  private String myName = "";

  public void hello() {
    System.out.println(myName + "입니다. 안녕하세요");
  }

  public void setMyname(String name) {
    if(myName == "") {
      myName = name;
    }
  }

  public void renameMyName(String name) {
    if (myName != "") {
      myName = name;
    }
  }
}
