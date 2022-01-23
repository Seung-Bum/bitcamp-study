package com.eomcs.app6_1;

import java.util.ArrayList;

public class Command {
  String name;
  ArrayList params = new ArrayList();

  public Command (String[] values) {
    for (String value : values) {
      this.params.add(value);
    }
    this.name = (String)params.get(0);
  }

  public String getName() {
    return this.name;
  }

  public int getNum(int paramIndex) {
    return Integer.parseInt((String)this.params.get(paramIndex));
  }

  public int getPramSize() {
    return params.size();
  }
}
