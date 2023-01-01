package LakshayaSirquestions.Pattern.Random;

/*
    1   // 4
   12   // 3
  123   // 2
 1234   // 1
12345
*/
public class Simple5Ajib {
    public static void main(String[] args) {
        for ( int i = 1; i <= 5; i++ ) {
            int count = 1;
            for ( int j = 1; j <= 5; j++ ) {
                if ( j <= 5 - i ) {
                    System.out.print("-");
                } else {
                    System.out.print(count);
                    count++;
                }
            }
            System.out.println();
        }
    }
}
