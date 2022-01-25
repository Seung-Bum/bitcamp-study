package com.eomcs.mylist.dao;

import com.eomcs.mylist.domain.Contact;

public interface ContactDao {

  // 인터페이스는 객체의 메서드 호출 규칙을 정의하는 것이기 때문에 
  // 메서드를 작성할 때 메서드 몸체(method body)를 작성하지 말아야 한다.
  // 메서드 바디가 없는 메서드를 "추상 메서드(abstract method)"라 부른다.
  // 메서드 호출 규칙(이름)이 제각각이면 유지보수 힘듬

  int countAll();

  Object[] findAll();

  void insert(Contact contact) throws Exception;

  Contact findByNo(int no);

  int update(int no, Contact contact) throws Exception;

  int delete(int no) throws Exception;

  //  void increaseViewCount(int no) throws Exception;
}