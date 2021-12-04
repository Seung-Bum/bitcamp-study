//배열: 같은 종류의 메모리를 여러 개 만드는 명령문
package com.eomcs.study.lang.variable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("lang.variable.exam2") // 클래스 이름이 같을때 충돌 방지, 스프링부트가 소스를 관리하기 위해 필요
@RequestMapping("/lang/variable/exam2")// 웹서버에 호출을 할 때 사용하는 경로
public class Exam2 {

  //여러개의 값을 받는 방법: 배열 사용 전
  @GetMapping("/test1")
  public String test1(String name1, String name2, String name3, String name4) {
    return " => " + name1 + "," + name2 + "," + name3 + "," + name4 + ",";
  }

  //여러개의 값을 받는 방법: 배열 사용 후
  @GetMapping("/test2")
  public String test2(String[] name) {
    return " => " + name[0] + "," + name[1] + "," + name[2] + "," + name[3] + ",";
  }

}