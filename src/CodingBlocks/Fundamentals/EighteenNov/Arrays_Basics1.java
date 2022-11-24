package CodingBlocks.Fundamentals.EighteenNov;

public class Arrays_Basics1 {
    public static void main(String[] args) {
        int[] arr = {10, 2, 13, 9, 200, 3, -14};

        int result = Max(arr); // sabse bada aam hoga -> 200;
        System.out.println(result);
    }

    public static int Max(int[] boori) {

        // there are two ways to initialize this variable
        // we can either assign negative infinity so that it can be the least number,
        // or it can be the first number from array
//        int jeb = Integer.MIN_VALUE;
        int jeb = boori[0];

        // agr jeb main jo aam hai vo feke hue aam se chota hai
        // to jeb wale aam ko feke hue aam se replace kero
        for ( int aam : boori ) {
            if ( aam > jeb ) {
                jeb = aam;
            }
        }

        return jeb;
    }
    

}
