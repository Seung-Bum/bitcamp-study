package com.eomcs.mylist;

import java.sql.Date;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class BoardController {

  // Board 객체 목록을 저장할 메모리를 준비한다.
  ArrayList boardList = new ArrayList();

  @RequestMapping("/board/list")
  public Object list() {
    return ArrayList.toArray(boardList); 
  }

  @RequestMapping("/board/add")
  public Object add(Board board) {
    board.createdDate = new Date(System.currentTimeMillis());
    System.out.println(board);
    ArrayList.add(boardList, board);
    return boardList.size;
  }

  @RequestMapping("/board/get")
  public Object get(int index) {
    if (index == -1) {
      return "";
    }
    Board board = (Board) boardList.list[index];
    board.viewCount++;
    return board;
  }

  @RequestMapping("/board/update")
  public Object update(int index, Board board) { // board에 들어간 값이 새로운 기존값 대체
    if (index == -1) {
      return 0;
    }

    Board old = (Board) boardList.list[index];
    board.viewCount = old.viewCount;
    board.createdDate = old.createdDate;

    return ArrayList.set(boardList, index, board) == null ? 0 : 1;
  }

  @RequestMapping("/board/delete")
  public Object delete(int index) {
    if (index == -1) {
      return 0;
    }
    return ArrayList.remove(boardList, index) == null ? 0 : 1;
  }

}