package main;

//import main.subdir.ImportClass;

public class Test {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    main.ImportClass ic = new main.ImportClass();
    main.subdir.ImportClass ics = new main.subdir.ImportClass();
  }
}
