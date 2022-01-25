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
  public Contact findByNo(String email) {
    int no = indexOf(email);
    if (no < 0 || no >= contactList.size()) {
      return null;
    }
    return (Contact) contactList.get(no);
  }

  @Override
  public int update(String email, Contact contact) throws Exception {
    int no = indexOf(email);
    if (no < 0 || no >= contactList.size()) {
      return 0;
    }
    contactList.set(no, contact);
    save();
    return 1;
  }

  @Override
  public int delete(String email) throws Exception {

    int no = indexOf(email);

    if (no < 0 || no >= contactList.size()) {
      return 0;
    }
    contactList.remove(no);
    save();
    return 1;
  }

  //  email로 index 찾을 수 있게 끔 바꿔야함 -> findByNo와 udate, delete 연결
  int indexOf(String email) {
    for (int i = 0; i < contactList.size(); i++) {
      Contact contact =  (Contact) contactList.get(i);
      if (contact.getEmail().equals(email)) { 
        return i;
      }
    }
    return -1;
  }

}
