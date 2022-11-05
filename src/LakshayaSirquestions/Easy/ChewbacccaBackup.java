package LakshayaSirquestions.Easy;

import java.util.Scanner;

public class ChewbacccaBackup {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int inp = sc.nextInt();

    int tenthPlace = 1;
    int newNum = 0;

    while ( true ) {
      int num = inp % 10;
      if ( inp != 0 ) {
        if ( num > 5 && num != 0 ) {
          int chewNum = 9 - num;
          newNum = (newNum * tenthPlace) + chewNum;
          tenthPlace = tenthPlace * 10;
        }
      } else {
        break;
      }
      //
      inp = inp / 10;
    }

    System.out.println(newNum);

  }
}

