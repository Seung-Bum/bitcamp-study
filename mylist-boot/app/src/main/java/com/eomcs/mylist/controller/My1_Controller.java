package com.eomcs.mylist.controller;

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
    for (int i = 0; i < size; i++) {
      if (poketmons[i].split(",")[0].equals(no)) {
        return 0;
      }
    }
    poketmons[size++] = poketmon;
    return size;
  }

  @RequestMapping("/poketmons/get")
  public Object get(String no) {
    for (int i = 0; i < size; i++) {
      if (poketmons[i].split(",")[0].equals(no)) {
        return poketmons[i];
      }
    }
    return "not found";
  }

  @RequestMapping("/poketmons/update")
  public Object update(String no, String poketName, String att, String skill) {
    String poketmon = no + "," + poketName + "," + att + "," + skill;
    for (int i = 0; i < size; i++) {
      if (poketmons[i].split(",")[0].equals(no)) {
        poketmons[i] = poketmon;
        return 1;
      }
    }
    return 0;
  }

  @RequestMapping("/poketmons/delete")
  public Object delete(String no) {
    for (int i = 0; i < size; i++) {
      if (poketmons[i].split(",")[0].equals(no)) {

        // 현재 위치의 다음 항목에서 배열 끝까지 반복하며 앞으로 값을 당겨온다.
        for (int j = i + 1; j < size; j++) {
          poketmons[j-1] = poketmons[j]; 
        }
        size--;
        return 1;
      }
    }
    return 0;
  }


}
