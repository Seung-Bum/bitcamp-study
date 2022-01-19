package com.eomcs.mylist.domain;

import java.sql.Date;

public class Board implements java.io.Serializable {
  String title;
  String content;
  int viewCount;
  java.sql.Date createdDate;

  //Board 생성자
  public Board() {
    System.out.println("Board() 호출됨!");
  }

  public Board(String csvStr) {
    // 예) csvStr => "제목,내용,조회수,등록일"
    System.out.println("Board(String csvStr) 호출됨!");

    String[] values = csvStr.split(","); 
    this.setTitle(values[0]); 
    this.setContent(values[1]);
    this.setViewCount(Integer.valueOf(values[2]));
    this.setCreatedDate(Date.valueOf(values[3]));
  }

  public static Board valueOf(String csvStr) {
    // 예) csvStr => "제목,내용,조회수,등록일"
    System.out.println("Board valueOf(String csvStr) 호출됨!");

    String[] values = csvStr.split(",");

    Board board = new Board();
    board.setTitle(values[0]); 
    board.setContent(values[1]);
    board.setViewCount(Integer.valueOf(values[2]));
    board.setCreatedDate(Date.valueOf(values[3]));

    return board;
  }


  // Board 객체에서 메모장으로 보낼때 사용
  public String toCsvString() {
    return String.format("%s,%s,%s,%s", 
        this.getTitle(), 
        this.getContent(), 
        this.getViewCount(), 
        this.getCreatedDate());
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

  //  @Override
  //  public String toString() {
  //    return "Contact [title=" + title + ", viewCount=" + viewCount + ", content=" + content
  //        + ", createdDate=" + createdDate + "]";
  //  }

}
