package CodingBlocks.Fundamentals.ElevenNov;

public class Rot_5 {
    public static void main(String[] args) {
        int rot = 30000002;
        int num = 12345;

        int nod = 0;
        int back_up = num;

        while ( num > 0 ) {
            num = num / 10;
            nod++;
        }
        num = back_up;
        rot = rot % nod;
        System.out.println("rotation " + rot);

        int divisor = ( int ) Math.pow(10, rot);
        int p1 = num / divisor; // first part
        int p2 = num % divisor; // last part

        System.out.println(p1 + " " + p2);

        int mult = ( int ) Math.pow(10, nod - rot);
        System.out.println(mult * p2 + p1);
    }
}
