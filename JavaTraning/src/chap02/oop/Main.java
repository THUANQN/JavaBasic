package chap02.oop;

public class Main {
  public static void main(String[] args) {
    
    Student studentOne = new Student();
    Student studentTwo = new Student();

    studentOne.birthday = 1994;
    studentOne.name = "John";
    studentOne.code = "S001";

    studentTwo.birthday = 1996;
    studentTwo.name = "Jenny";
    studentTwo.code = "S002";

    System.out.println("Name: " + studentOne.name);
    System.out.println("Code: " + studentOne.code);
    System.out.println("Birthday: " + studentOne.birthday);

    System.out.println("--------------------------------");

    System.out.println("Name: " + studentTwo.name);
    System.out.println("Code: " + studentTwo.code);
    System.out.println("Birthday: " + studentTwo.birthday);

  }
}


