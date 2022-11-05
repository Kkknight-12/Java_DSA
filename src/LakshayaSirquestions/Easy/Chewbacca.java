package LakshayaSirquestions.Easy;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Chewbacca {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int inp = sc.nextInt();

    String newStr = String.valueOf(inp);
    char[] charArray = newStr.toCharArray();

    int f = charArray[0] - '0';
    if ( f == 9 ) {
      charArray[0] = '9';
    } else {
      if ( f > 4 ) {
//        charArray[0] = ( char ) (9 - f);
        int temp = 9 - f;
        Array.setChar(charArray, 1, ( char ) temp);
      }
    }


    System.out.println(new String(charArray));

  }
}
