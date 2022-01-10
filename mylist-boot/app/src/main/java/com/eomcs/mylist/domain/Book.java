package com.eomcs.mylist.domain;

import java.sql.Date;

// 다른 패키지에서 접근가능하도록 public
public class Book {
  String title;
  String author;
  String press;
  int page;
  int price;
  Date readDate;
  String feed;

  public Book() {
    System.out.println("Book() 기본 생성자 호출됨!");
  }

  public static Book valueOf(String csvStr) {
    // 예) csvStr => "제목,내용,조회수,등록일"
    System.out.println("Book valueOf(String csvStr) 호출됨!");

    String[] values = csvStr.split(",");

    Book book = new Book();
    book.setTitle(values[0]); 
    book.setAuthor(values[1]);
    book.setPress(values[2]);
    book.setPage(Integer.valueOf(values[3])); // 문자열을 입력받아서 int로 리턴
    book.setPrice(Integer.valueOf(values[4]));
    book.setReadDate(Date.valueOf(values[5])); // 문자열을 입력받아서 date 타입으로 리턴
    book.setFeed(values[6]);

    return book;
  }

  // Book 객체에서 메모장으로 보낼때 사용 (객체를 String 문자열 형태로 변경하여 리턴)
  public String toCsvString() {
    return String.format("%s,%s,%s,%s,%s,%s,%s", 
        this.getTitle(), 
        this.getAuthor(), 
        this.getPress(), 
        this.getPage(),
        this.getPrice(),
        this.getReadDate(),
        this.getFeed()
        );
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getPress() {
    return press;
  }

  public void setPress(String press) {
    this.press = press;
  }

  public int getPage() {
    return page;
  }

  public void setPage(int page) {
    this.page = page;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public java.sql.Date getReadDate() {
    return readDate;
  }

  public void setReadDate(java.sql.Date readDate) {
    System.out.println("실행되었습니다 date");
    this.readDate = readDate;
  }

  public String getFeed() {
    return feed;
  }

  public void setFeed(String feed) {
    this.feed = feed;
  }

  @Override
  public String toString() {
    return "Book [title=" + title + ", author=" + author + ", press=" + press + ", page=" + page
        + ", price=" + price + ", readDate=" + readDate + ", feed=" + feed + "]";
  }

}
