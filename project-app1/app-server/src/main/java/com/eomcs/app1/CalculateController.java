package com.eomcs.app1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateController {

  @RequestMapping("/calc")
  public String calc(String op, double a, double b) {
    // 사용자가 값을 스트링이나 인트로 따로 바꿔줄 필요 없이 스프링부트가 바꿔준다.

    String response = null;

    switch (op) {
      case "+": 
        response = String.format("강사: %.1f + %.1f = %.2f", a, b, (a + b));
        break;
      case "-": 
        response = String.format("강사: %.1f - %.1f = %.2f", a, b, (a - b));
        break;
      case "*": 
        response = String.format("강사: %.1f * %.1f = %.2f", a, b, (a * b));
        break;  
      case "/": 
        response = String.format("강사: %.1f / %.1f = %.2f", a, b, (a / b));
        break;
      default: 
        response = "강사: 지원하지 않는 연산자입니다.";
    }

    return response;

  }
}
