package com.eomcs.mylist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class BoardController {

  @RequestMapping("/board/list")
  public Object list() {
    return ArrayList.toArray(); 
  }

  @RequestMapping("/board/add")
  public Object add(Board board) {
    System.out.println(board);
    ArrayList.add(board);
    return ArrayList.size;
  }


  @RequestMapping("/board/get")
  public Object get(String number) {
    int index = Integer.parseInt(number);
    if (index == -1) {
      return "";
    }

    return ArrayList.list[index];
  } 

  @RequestMapping("/board/update")
  public Object update(Board board) {
    int index = board.number;
    if (index == -1) {
      return 0;
    }

    return ArrayList.set(index, board) == null ? 0 : 1;
  }

  @RequestMapping("/board/delete")
  public Object delete(String number) {
    int index = indexOf(number);
    if (index == -1) {
      return 0;
    }

    ArrayList.remove(index);
    return 1;
  }

  static int indexOf(String number) {
    for (int i = 0; i < ArrayList.size; i++) {
      Board board = (Board) ArrayList.list[i];
      number = Integer.parseInt(number);
      if (board.number.equals(number)) { 
        return i;
      }
    }
    return -1;
  }
}




