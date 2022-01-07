package com.eomcs.mylist.domain;

public class Board {
  String title;
  int viewCount;
  String content;
  java.sql.Date createdDate;

  // Board 생성자
  public Board(String csvStr) {
    String[] values = csvStr.split(","); 
    this.setTitle(values[0]); // 배열에 들어 있는 각 항목을 객체의 필드에 저장한다.
    //    this.setViewCount(values[1]);
    this.setContent(values[2]);
    //    this.setCreatedDate(values[3]);
  }

  public static Board valueOf(String csvStr) {
    // 예) csvStr => "제목,2,ㅎㅎㅎ,2022-01-07"

    String[] values = csvStr.split(","); // 예) ["제목","2","ㅎㅎㅎ","2022-01-07"]

    // board 객체를 다시 만듬
    // 위에 있는 board 생성자 실행
    Board board = new Board();
    board.setTitle(values[0]); // 배열에 들어 있는 각 항목을 객체의 필드에 저장한다.
    board.setViewCount(Integer.parseInt(values[1]));
    board.setContent(values[2]);
    //    board.setCreatedDate(values[3]);

    return board;
  }


  // Board 객체에서 메모장으로 보낼때 사용
  public String toCsvString() {
    return String.format("%s,%s,%s,%s", 
        this.getTitle(), 
        this.getViewCount(), 
        this.getContent(), 
        this.getCreatedDate());
  }


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
