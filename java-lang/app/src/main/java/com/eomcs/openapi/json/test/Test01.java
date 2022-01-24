package com.eomcs.openapi.json.test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Test01 {

  public static void main(String[] args) throws Exception {
    String jsonStr = "{\"name\":\"소보루\", \"maker\":\"안데르센\"}";

    ObjectMapper mapper = new ObjectMapper();

    // .class 넘어오는 json의 정보가 어떤건지 알려줘야함
    Car obj = mapper.readValue(jsonStr, Car.class);

    System.out.println(obj);
  }

}
