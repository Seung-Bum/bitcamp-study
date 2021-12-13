package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class My1_Controller {

  String[] poketmons = new String[5];
  int size = 0;

  @RequestMapping("/poketmons/list")
  public Object list() {
    String[] arr = new String[size]; // 배열에 저장된 값만 복사할 새 배열을 만든다.
    for (int i = 0; i < size; i++) {
      arr[i] = poketmons[i];// 전체 배열에서 갑이 들어 있는 항목만 복사한다.
    }
    return arr; // 복사한 항목들을 담고있는 새 배열을 리턴한다.
  }

  @RequestMapping("/poketmons/add")
  public Object add(String no, String poketName, String att, String skill) {
    String poketmon = no + "," + poketName + "," + att + "," + skill;
    poketmons[size++] = poketmon;
    return size;
  }

  @RequestMapping("/poketmons/get")
  public Object get(String no) {
    for (int i = 0; i < size; i++) {
      if (poketmons[i].split(",")[1].equals(no)) {
        return poketmons[i];
      }
    }
    return "not found";
  }

}
