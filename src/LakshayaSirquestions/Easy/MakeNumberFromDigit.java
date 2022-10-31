package LakshayaSirquestions.Easy;

import java.util.Scanner;

public class MakeNumberFromDigit {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

//    int N = 1386;
    int Num = sc.nextInt();
    String result = "";

    for ( int i = 0; i < Num; i++ ) {
      int Digits = sc.nextInt();
      result += Digits;
    }

    System.out.println(result);

  }
}
