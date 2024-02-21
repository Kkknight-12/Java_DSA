package Questions.Easy.RepalceThemAll;

public class ReplaceEasy {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String num = sc.nextLine();
        String num = "102";
        SolutionOne(num);
        SolutionTwo(num);
    }

    static void SolutionOne(String num) {
        for ( int i = 0; i < num.length(); i++ ) {
            if ( num.charAt(i) == '0' ) {
                num = num.substring(0, i) + '5' + num.substring(i + 1);
            }
        }
        System.out.println(num);
    }

    static void SolutionTwo(String num) {
        num = num.replace('0', '5');
        System.out.println(num);
    }
}

