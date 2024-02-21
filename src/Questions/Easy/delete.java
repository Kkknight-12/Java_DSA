package Questions.Easy;

public class delete {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int range = 10;
        int sum = 0;

        for ( int i = 2; i <= range; i++ ) {
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(sum);
    }
}

//    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        int T = scn.nextInt();
//        while ( T > 0 ) {
//            int M = scn.nextInt();
//            int N = scn.nextInt();
//            int mob = 1;
//            while ( true ) {
//                if ( M >= mob ) {
//                    M = M - mob;
//                } else {
//                    System.out.println("Harshit");
//                    break;
//                }
//                mob++;
//                if ( N >= mob ) {
//                    N = N - mob;
//                } else {
//                    System.out.println("Aayush");
//                    break;
//                }
//                mob++;
//                T--;
//            }
//        }
//    }

