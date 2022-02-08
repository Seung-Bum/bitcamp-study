package com.eomcs.net.ex11.step01_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class CalculatorClient {
  public static void main(String[] args) {

    try (Socket socket = new Socket("localhost", 8888);
        PrintStream out = new PrintStream(socket.getOutputStream());
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()))) {

      String input = in.readLine();
      System.out.println(input);

      input = in.readLine();
      System.out.println(input);

      input = in.readLine();
      System.out.println(input);

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}
