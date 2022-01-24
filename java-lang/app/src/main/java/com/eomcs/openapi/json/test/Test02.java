package com.eomcs.openapi.json.test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test02 {

  public static void main(String[] args) throws Exception {
    String jsonStr = "[{\"name\":\"소보루\", \"maker\":\"안데르센\"}, {\"name\":\"소보루\", \"maker\":\"안데르센\"}]";

    ObjectMapper mapper = new ObjectMapper();

    // .class 넘어오는 json의 정보가 어떤건지 알려줘야함
    // 배열이면 배열객체로 만들어줘야함
    Bread[] arr = mapper.readValue(jsonStr, Bread[].class);

    for (Bread obj : arr) {
      System.out.println(obj);
    }

  }

}
