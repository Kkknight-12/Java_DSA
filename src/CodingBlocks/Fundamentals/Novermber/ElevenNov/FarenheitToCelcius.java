package CodingBlocks.Fundamentals.Novermber.ElevenNov;

/*
 * C to F
 * (9/5 * c) + 32
 *
 * F to C
 * 5/9 * ( F - 32 )  */
public class FarenheitToCelcius {
    public static void main(String[] args) {

        int min = 0;
        int max = 100;
        int step = 20;

        for ( int i = min; i <= max; i = i + step ) {
            System.out.println(i + "\t" + FarenheitToCelciusConversion(i));
        }
    }

    public static int FarenheitToCelciusConversion(int f) {
//        return ((f - 32) * 5) / 9;
        return ( int ) (5 / 9.0 * (f - 32));
    }
}

/*
 * 5/9 * ( F - 32 )
 * doing so with int will convert 5/9 to 0 -> round of float to int
 *  */