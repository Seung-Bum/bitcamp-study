package com.eomcs.mylist;

public class Board {

  static int count = 0;

  int number;
  String title;
  String content;
  int viewCount;
  java.sql.Date createdDate;

  public int getNumber() {
    return number;
  }
  public void setNumber(int number) {
    count++;
    this.number = count;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public int getViewCount() {
    return viewCount;
  }
  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }
  public java.sql.Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(java.sql.Date createdDate) {
    this.createdDate = createdDate;
  }

  @Override
  public String toString() {
    return "Board [number=" + number + ", title=" + title + ", content=" + content + ", viewCount="
        + viewCount + ", createdDate=" + createdDate + "]";
  }

}
