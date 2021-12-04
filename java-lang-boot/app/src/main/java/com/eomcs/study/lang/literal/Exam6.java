// 리터럴: 문자 리터럴과 이스케이프 캐릭터
package com.eomcs.study.lang.literal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lang/literal/exam6")
public class Exam6 {

  @GetMapping("/test1")
  public String test1() {
    return "012ABC가각간똘똠똡똥";
  }

  @GetMapping("/test2")
  public String test2() {
    //제어코드
    return "012ABC가각간똘똠똡똥";
  }




}
