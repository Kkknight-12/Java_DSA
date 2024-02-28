package LearnBasics.LinearDataStructure.Array.TwoDArray;

/*
 *       | Column 0  | Column 1  | Column 2  |
 * ------------------------------------------
 * Row 0 | x [0][0]  | x [0][1]  | x [0][2]  |
 * ------------------------------------------
 * Row 1 | x [1][0]  | x [1][1]  | x [1][2]  |
 * ------------------------------------------
 * Row 2 | x [2][0]  | x [2][1]  | x [2][2]  |
 * ------------------------------------------
 *
 * arr [row][column]
 *
 * */


public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] mt1 = {
            { 1, 2, 3, },
            { 2, 1, 2 },
        };

        int[][] mt2 = {
            { 4, 1, 3, 2 },
            { 0, 1, 0, 2 },
            { 5, 0, 3, 1 },
        };
//        System.out.println(mt1[0].length); // 3 cols
//        System.out.println(mt2.length); // 3 rows
//        System.out.println(mt2[0].length); // 4 cols
//        System.out.println(mt1.length); // 2

        int[][] multipliedMatrix = multiplyMatrix(mt1, mt2);
//        int[][] multipliedMatrix = multiplyMatrixTwo(mt1, mt2);
        PrintMatrix(multipliedMatrix);
    }

    public static int[][] multiplyMatrix(int[][] mt1, int[][] mt2) {

        int[][] result = new int[mt1.length][mt2[0].length];

        for ( int mt1Row = 0; mt1Row < mt1.length; mt1Row++ ) {
            for ( int mt2Col = 0; mt2Col < mt2[0].length; mt2Col++ ) {
                int mult = 0;
                for ( int mt2row = 0; mt2row < mt2.length; mt2row++ ) {
//                    System.out.print(mt2[mt2row][mt2Col] + " * " + mt1[mt1Row][mt2row] + " ");
                    mult += (mt2[mt2row][mt2Col] * mt1[mt1Row][mt2row]);
//                    System.out.println();
                }
                result[mt1Row][mt2Col] = mult;
//                System.out.println("multi " + mult);
//                System.out.println(" ");
            }
//            System.out.println("------ ");
        }
        return result;
    }

    public static void PrintMatrix(int[][] multipliedMatrix) {

        for ( int mtRow = 0; mtRow < multipliedMatrix.length; mtRow++ ) {
            for ( int mtCol = 0; mtCol < multipliedMatrix[0].length; mtCol++ ) {
                System.out.print(multipliedMatrix[mtRow][mtCol] + " ");
            }
            System.out.println();
        }
    }


    // other multiplication which can be used to iterate and multiply
    public static int[][] multiplyMatrixTwo(int[][] mt1, int[][] mt2) {
        int[][] result = new int[mt1.length][mt2[0].length];

        // mt1Row 2
        for ( int mt1Row = 0; mt1Row < mt1.length; mt1Row++ ) {
            // mt2Col 4
            for ( int mt2Col = 0; mt2Col < mt2[0].length; mt2Col++ ) {
                // mt1Col 3
                for ( int mt1Col = 0; mt1Col < mt1[0].length; mt1Col++ ) {
                    result[mt1Row][mt2Col] += mt1[mt1Row][mt1Col] * mt2[mt1Col][mt2Col];
                }

            }
        }
        return result;
    }

}
