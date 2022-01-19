package com.eomcs.mylist.controller;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.mylist.domain.Book;
import com.eomcs.util.ArrayList;

@RestController 
public class BookController {

  // Book 객체 목록을 저장할 메모리를 준비한다.
  ArrayList bookList = new ArrayList();


  public BookController() throws Exception {
    System.out.println("BookController() 호출됨!");

    // 주 작업 객체
    DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("books.ser1")));

    while (true) {
      try {
        Book book = new Book();
        book.setTitle(in.readUTF());
        book.setAuthor(in.readUTF());
        book.setPress(in.readUTF());
        book.setPage(in.readInt());
        book.setPrice(in.readInt());
        book.setFeed(in.readUTF());
        String date = in.readUTF();
        if (date.length() > 0) {
          book.setReadDate(Date.valueOf(date));
        }

        bookList.add(book);

      } catch (Exception e) { // 읽을 내용이 없으면 break
        System.out.println("독서 목록 데이터를 가져올 수 없습니다.");
      }

      in.close();

    }
  }


  @RequestMapping("/book/list")
  public Object list() {
    return bookList.toArray(); 
  }

  @RequestMapping("/book/add")
  public Object add(Book book) {

    book.setReadDate(new Date(System.currentTimeMillis()));
    bookList.add(book);
    return bookList.size();
  }

  @RequestMapping("/book/get")
  public Object get(int index) {
    if (index < 0 || index >= bookList.size()) {
      return "";
    }
    Book book = (Book) bookList.get(index);
    System.out.println("GET: " + book);
    return book;
  }

  @RequestMapping("/book/update")
  public Object update(int index, Book book) {
    if (index < 0 || index >= bookList.size()) {
      return 0;
    }
    return bookList.set(index, book) == null ? 0 : 1;
  }

  @RequestMapping("/book/delete")
  public Object delete(int index) {
    if (index < 0 || index >= bookList.size()) {
      return 0;
    }
    return bookList.remove(index) == null ? 0 : 1;
  }

  @RequestMapping("/book/save")
  public Object save() throws Exception {

    DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("books.ser1")));

    Object[] arr = bookList.toArray();
    for (Object obj : arr) {
      Book book = (Book) obj;
      out.writeUTF(book.getTitle());
      out.writeUTF(book.getAuthor());
      out.writeUTF(book.getPress());
      out.writeInt(book.getPage());
      out.writeInt(book.getPrice());
      out.writeUTF(book.getFeed());
      if (book.getReadDate() == null) {
        out.writeUTF("");
      } else {
        out.writeUTF(book.getReadDate().toString());
      }
    }
    out.close();
    return arr.length;
  }


}




