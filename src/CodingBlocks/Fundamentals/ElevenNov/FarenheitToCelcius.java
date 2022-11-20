package CodingBlocks.Fundamentals.ElevenNov;

/*
 * C to F
 * (9/5 * c) + 32
 *
 * F to C
 * 5/9 * ( F - 32 )  */
public class FarenheitToCelcius {
    public static void main(String[] args) {

        int minF = 0;
        int maxF = 100;
        int step = 20;

        for ( int F = minF; F <= maxF; F = F + step ) {
            System.out.println(F + "\t" + FarenheitToCelciusConversion(F));
//            System.out.println((F - 32) * 5 / 9);
        }
    }

    public static int FarenheitToCelciusConversion(int f) {
//        int c = ((f - 32) * 5) / 9;
        int c = ( int ) (5 / 9.0 * (f - 32));
        return c;
    }
}

/*
 * 5/9 * ( F - 32 )
 * doing so with int will convert 5/9 to 0 -> round of float to int
 *  */