package LakshayaSirquestions.Medium.String;

public class ASCIIPractice {
    public static void main(String[] args) {
        char[] str = "asdaaA".toCharArray();

        System.out.println('a' - 'A'); // 32
        System.out.println('A' - 'a'); // -32

        char tempStrCapital = ( char ) ('g' + 'A' - 'a');
        char tempStrSmall = ( char ) ('G' + 'a' - 'A');
        System.out.println(tempStrCapital); // G
        System.out.println(tempStrSmall); // g
    }
}
