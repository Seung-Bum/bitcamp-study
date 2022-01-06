package com.eomcs.mylist.domain;

public class Board {
  String title;
  int viewCount;
  String content;
  java.sql.Date createdDate;

  public Board() {
    System.out.println("Board() 호출됨!");
  }

  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public int getViewCount() {
    return viewCount;
  }
  public void setViewCount(int viewCount) {
    this.viewCount = viewCount;
  }
  public String getContent() {
    return content;
  }
  public void setContent(String content) {
    this.content = content;
  }
  public java.sql.Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(java.sql.Date createdDate) {
    this.createdDate = createdDate;
  }

  @Override
  public String toString() {
    return "Contact [title=" + title + ", viewCount=" + viewCount + ", content=" + content
        + ", createdDate=" + createdDate + "]";
  }

}
