package com.eomcs.mylist.domain;

public class Todo {
  String title;
  boolean done;

  public Todo() {
    System.out.println("Todo() 호출됨!");
  }

  public Todo(String csvStr) {
    // 예) csvStr => "제목, true"

    String[] values = csvStr.split(","); // 예) ["제목", "true"]
    this.setTitle(values[0]); // 배열에 들어 있는 각 항목을 객체의 필드에 저장한다.
    this.setDone(Boolean.valueOf(values[1]));

    System.out.println("Todo(String csvStr) 호출됨!");
  }


  public static Todo valueOf(String csvStr) {
    // 예) csvStr => "제목, true"

    String[] values = csvStr.split(",");

    Todo todo = new Todo();
    todo.setTitle(values[0]);
    todo.setDone(Boolean.valueOf(values[1]));

    return todo;
  }

  // Board 객체에서 메모장으로 보낼때 사용
  public String toCsvString() {
    return String.format("%s,%s", 
        this.getTitle(), 
        this.isDone());
  }

  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public boolean isDone() {
    return done;
  }
  public void setDone(boolean done) {
    this.done = done;
  }

  //  @Override
  //  public String toString() {
  //    return "Todo [title=" + title + ", done=" + done + "]";
  //  }


}
