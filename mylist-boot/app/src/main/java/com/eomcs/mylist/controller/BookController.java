package com.eomcs.mylist.controller;

import java.sql.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.mylist.dao.BookDao;
import com.eomcs.mylist.domain.Book;

@RestController 
public class BookController {

  // Book 객체 목록을 저장할 메모리를 준비한다.
  // @Autowired
  // - 필드 선언부에 이 애노테이션을 붙여서 표시해 두면, 
  //   Spring Boot가 BoardController 객체를 만들 때 BoardDao 구현체를 찾아 자동으로 주입한다. 
  //
  @Autowired
  BookDao bookDao;


  @RequestMapping("/book/list")
  public Object list() {
    return bookDao.findAll(); 
  }

  @RequestMapping("/book/add")
  public Object add(Book book) throws Exception {
    book.setReadDate(new Date(System.currentTimeMillis()));
    bookDao.insert(book);
    return bookDao.countAll();
  }

  @RequestMapping("/book/get")
  public Object get(int index) {
    Book book = bookDao.findByNo(index);
    if (book == null) {
      return "";
    }
    return book;
  }

  @RequestMapping("/book/update")
  public Object update(int index, Book book) throws Exception {
    Book old = bookDao.findByNo(index);
    if (old == null) {
      return 0;
    }
    book.setReadDate(new Date(System.currentTimeMillis()));

    return bookDao.update(index, book);
  }

  @RequestMapping("/book/delete")
  public Object delete(int index) throws Exception {
    return bookDao.delete(index);
  }

}




