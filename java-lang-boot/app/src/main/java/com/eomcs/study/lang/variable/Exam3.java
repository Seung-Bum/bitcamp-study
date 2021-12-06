// 변수 : 스프링 부트의 자동 형변환
package com.eomcs.study.lang.variable;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("lang.variable.Exam3") // 클래스 이름이 같은 경우 충돌 방지
@RequestMapping("/lang/variable/exam3")
public class Exam3 {

  //스프링 부트는 클라이언트가 보낸 값을 파라미터 타입에 맞춰 자동 형변환을 수행한다.
  // => 웹브라우저가 보내는 값은 무조건 "문자열"이다.


  // 1) "100" ==> byte
  //테스트 URL:
  //=> http://localhost:8080/lang/variable/exam3/test1?value=100
  @GetMapping("/test1")
  public String test1(byte value) {
    return "==> " + value;
  }

  //=> http://localhost:8080/lang/variable/exam3/test2?value=32767
  @GetMapping("/test2")
  public String test2(short value) {
    return "==> " + value;
  }

  //=> http://localhost:8080/lang/variable/exam3/test2?value=32768  
  @GetMapping("/test3")
  public String test3(int value) {
    return "==> " + value;
  }


  //=> http://localhost:8080/lang/variable/exam3/test2?value=32768  
  @GetMapping("/test4")
  public String test4(int value) {
    return "==> " + value;
  }



}







