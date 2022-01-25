package com.eomcs.mylist.dao;

import com.eomcs.mylist.domain.Contact;
import com.eomcs.util.ArrayList;

public abstract class AbstractContactDao implements ContactDao{

  protected ArrayList contactList = new ArrayList(); 

  protected abstract void save() throws Exception;

  // interface 오버라이딩
  @Override
  public int countAll() {
    return contactList.size();
  }

  @Override
  public Object[] findAll() {
    return contactList.toArray();
  }

  @Override
  public void insert(Contact contact) throws Exception {
    contactList.add(contact);
    save(); // this 생략
  }

  @Override
  public Contact findByNo(int no) {
    if (no < 0 || no >= contactList.size()) {
      return null;
    }
    return (Contact) contactList.get(no);
  }

  // email로 index 찾을 수 있게 끔 바꿔야함
  //  int indexOf(String email) {
  //    for (int i = 0; i < contactList.size(); i++) {
  //      Contact contact =  (Contact) contactList.get(i);
  //      if (contact.getEmail().equals(email)) { 
  //        return i;
  //      }
  //    }
  //    return -1;
  //  }

  @Override
  public int update(int no, Contact contact) throws Exception {
    if (no < 0 || no >= contactList.size()) {
      return 0;
    }
    contactList.set(no, contact);
    save();
    return 1;
  }

  @Override
  public int delete(int no) throws Exception {
    if (no < 0 || no >= contactList.size()) {
      return 0;
    }
    contactList.remove(no);
    save();
    return 1;
  }

  //  연락처 목록에 조회수는 없음
  //  @Override
  //  public void increaseViewCount(int no) throws Exception {
  //    Contact contact = findByNo(no);
  //    contact.setViewCount(contact.getViewCount() + 1);
  //    save();
  //  }
}
