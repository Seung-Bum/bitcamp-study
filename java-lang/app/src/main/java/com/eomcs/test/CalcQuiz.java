package com.eomcs.test;

import java.util.Random;

public class CalcQuiz {
  String question;
  String answer;

  public CalcQuiz () {
    createQuestion();
  }

  void createQuestion() {
    Random rnd = new Random();
    int a = rnd.nextInt(100);
    int b = rnd.nextInt(100);
    question = a + "x" + b + "= ?";
    answer = Integer.toString(a * b);
  }

  public String getQuestion() {
    return question;
  }

  public String getAnswer() {
    return answer;
  }
}
