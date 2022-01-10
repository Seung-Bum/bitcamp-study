package com.eomcs.io;

import java.io.FileReader;

public class FileReader2 {

  // 기존의 클래스 포함!
  FileReader in;

  // 수퍼 클래스의 생성자는 바로 사용할 수 없다.
  // 서브 클래스의 생성자를 통해 사용해야 한다.
  public FileReader2(String filename) throws Exception {

    // 다음과 같이 수퍼 클래스의 생성자를 호출해야 한다.
    in = new FileReader(filename);
  }

  public String readLine() throws Exception {
    StringBuilder buf = new StringBuilder();
    int c;
    while ((c = in.read()) != -1) {// 파일에서 한 문자를 읽는다. 더이상 읽을 문자가 없으면 종료
      if (c == '\n') { // 만약 읽은 문자가 줄바꿈 명령이라면, 지금까지 읽은 CSV 데이터를 분석하여 Contact 객체에 담는다.
        return buf.toString();
      } else if (c== '\r') {
        // 무시! CR(Carrage Return; \r) 코드는 버퍼에 담지 않고 버린다.
      } else { // 문자를 읽을 때 마다 버퍼에 임시 보관한다.
        buf.append((char) c);
      }
    }
    return buf.toString();
  }

  public void close() throws Exception {
    in.close();
  }
}
