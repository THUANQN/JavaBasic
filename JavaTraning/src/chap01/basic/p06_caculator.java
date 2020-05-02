package chap01.basic;

import java.util.Scanner;

public class p06_caculator {
  public static void main(String[] args) {
    int firstNumber;
    int secondNumber;
    String operator; 
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("The first number : ");
    firstNumber = sc.nextInt();
    sc.nextLine();

    System.out.println("The second number : ");
    secondNumber = sc.nextInt();
    sc.nextLine();

    System.out.println("Caculate : ");
    operator = sc.nextLine();

    sc.close();

    System.out.println("The fisrt number: " + firstNumber);
    System.out.println("The second number: " + secondNumber);
    System.out.println("Operator: " + operator);
  } 
}