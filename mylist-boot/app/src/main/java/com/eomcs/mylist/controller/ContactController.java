package com.eomcs.mylist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eomcs.mylist.dao.ContactDao;
import com.eomcs.mylist.domain.Contact;

@RestController 
public class ContactController {

  // @Autowired
  // - 필드 선언부에 이 애노테이션을 붙여서 표시해 두면, 
  //   Spring Boot가 BoardController 객체를 만들 때 BoardDao 구현체를 찾아 자동으로 주입한다. 
  //
  @Autowired
  ContactDao contactDao;

  @RequestMapping("/contact/list")
  public Object list() {
    return contactDao.findAll();
  }

  @RequestMapping("/contact/add")
  public Object add(Contact contact) throws Exception {
    contactDao.insert(contact);
    return contactDao.countAll();
  }


  // index 값으로 email 받음
  @RequestMapping("/contact/get")
  public Object get(int index) throws Exception {
    Contact contact = contactDao.findByNo(index);
    if (contact == null) {
      return "";
    }

    return contact;
  }


  @RequestMapping("/contact/update")
  public Object update(int index, Contact contact) throws Exception {
    Contact old = contactDao.findByNo(index);
    if (old == null) {
      return 0;
    }

    //    기존하고 같아야할 사항이 있는지
    //    board.setViewCount(old.getViewCount());
    //    board.setCreatedDate(old.getCreatedDate());

    return contactDao.update(index, contact);
  }

  @RequestMapping("/contact/delete")
  public Object delete(int index) throws Exception {
    return contactDao.delete(index);
  }



}




