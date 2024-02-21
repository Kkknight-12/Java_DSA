package Questions.Easy.ShoppingGame;

public class SolutionTwo {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int T = scn.nextInt();
        int T = 1;
        while ( T > 0 ) {
//            int M = scn.nextInt();
//            int N = scn.nextInt();
            int M = 9;
            int N = 3;

            int mob = 1;
            while ( true ) {
                if ( M >= mob ) {
                    M = M - mob;
                    System.out.println("M  - " + M);
                } else {
                    System.out.println("Harshit");
                    break;
                }
                mob++;
                if ( N >= mob ) {
                    N = N - mob;
                    System.out.println("N -" + N);
                } else {
                    System.out.println("Aayush");
                    break;
                }
                mob++;
                T--;
            }
        }
    }
}
