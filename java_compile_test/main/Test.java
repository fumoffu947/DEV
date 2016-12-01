package main;

import java.lang.Integer;
import java.util.ArrayList;

//import main.subdir.ImportClass;

public class Test {
  private ArrayList<Integer> list = new ArrayList<Integer>();

  public static void main(String[] args) {
    System.out.println("Hello World!");
    main.ImportClass ic = new main.ImportClass();
    main.subdir.ImportClass ics = new main.subdir.ImportClass();
    if (args.length > 0) {
      Test t = new Test(Integer.parseInt(args[0]));
      t.printList();
    } else {
      System.out.println("not enough args");
    }
  }

  public Test(int arraySize) {
    for(int i = 0; i < arraySize; i++) {
      list.add(i);
    }
  }

  public void printList() {
    for(int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
