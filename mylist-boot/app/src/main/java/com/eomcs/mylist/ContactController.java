package com.eomcs.mylist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 클라이언트 요청을 처리하는 역할
public class ContactController {

  // 인스턴스 변수
  // => 모든 인스턴스 메서드가 공유한다.
  //
  String[] contacts = new String[5];
  int size = 0;


  // /contact/list 실행 URL주소
  // 연락처가 추가된 수만큼 records 배열 생성후 contacts배열의 정보를 담음
  @GetMapping("/contact/list")
  public Object list() {
    String[] records = new String[size];
    for (int i = 0; i < size; i++) {
      records[i] = contacts[i];
    }
    return records;
  }

  // /contact/add 실행 URL주소
  // 연락처 정보받아서 contacts 인스턴스 배열에 넣음, size는 넣어지고 나서 +1됨
  @GetMapping("/contact/add")
  public Object add(String name, String email, String tel, String company) {
    contacts[size++] = name + "," + email + "," + tel + "," + company;
    return size;
  }

  // /contact/get 실행 URL주소
  // email 주소를 통해 나머지 정보들을 가져옴
  @GetMapping("/contact/get")
  public Object get(String email) {
    for (int i = 0; i < size; i++) {
      if (email.equals(contacts[i].split(",")[1])) {
        return contacts[i];
      }
    }
    return "";
  }


}
