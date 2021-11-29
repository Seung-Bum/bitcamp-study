// 리터럴 : 숫자를 표현하는 다양한 방법
package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam2")
public class Exam2 {

  @GetMapping("/test1")
  public int test1() {return 100;} // 10진수(숫자를 표현할때 기본으로 많이사용)

  @GetMapping("/test2")
  public int test2() {return 0144;} // 8진수

  @GetMapping("/test3")
  public int test3() {return 0b01100100;} // 2진수 binary

  @GetMapping("/test4")
  public int test4() {return 0x64;} // 16진수(문자의 코드값을 사용할때 많이사용)
}

