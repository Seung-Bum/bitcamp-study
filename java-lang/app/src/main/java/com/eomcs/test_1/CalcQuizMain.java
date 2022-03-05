package com.eomcs.test_1;

import com.eomcs.test.CalcQuiz;

public class CalcQuizMain {
  public static void main(String[] args) {
    int quizNum = 5;
    CalcQuiz []quiz = new CalcQuiz[quizNum];

    for (int i = 0; i < quizNum; i++) {
      quiz[i] = new CalcQuiz();
    }

    for (int i = 0; i < quizNum; i++) {
      System.out.println("문제" + i + ":" + quiz[i].getQuestion());
    }

    System.out.println("==========================================");

    for (int i = 0; i < quizNum; i++) {
      System.out.println("정답" + i + ":" + quiz[i].getAnswer());
    }

  }
}
