package Questions.Easy.RepalceThemAll;

public class ReplaceThemAll {
    public static void main(String[] args) {

        int n = 0;
//    Scanner sc = new Scanner(System.in);
//    int n = sc.nextInt();
        replaceZero(n);
    }

    static void replaceZero(int n) {
        String str = Integer.toString(n);
        int len = str.length();
        String str1 = "";

        for ( int i = 0; i < len; i++ ) {
            if ( str.charAt(i) == '0' )
                str1 = str1 + '5';
            else
                str1 = str1 + str.charAt(i);
        }
        System.out.println("Converted number is: " + str1);
    }
}


