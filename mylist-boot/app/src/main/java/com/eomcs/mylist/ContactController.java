package com.eomcs.mylist;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 클라이언트 요청을 처리하는 역할
public class ContactController {

  @GetMapping("/contact/list")
  public Object list() {
    String[] contacts = {
        "홍길동11,hong@test.com,010-1111-2222,비트캠프",
        "홍길동22,hong@test.com,010-1111-2222,비트캠프",
        "홍길동33,hong@test.com,010-1111-2222,비트캠프"
    };

    return contacts;
  }

  @GetMapping("/contact/add")
  public Object add(String name, String email, String tel, String company) {
    String contact = name + "," + email + "," + tel + "," + company;
    return contact;
  }
}
