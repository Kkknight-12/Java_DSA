package Questions.Medium.String;

public class charString {
    public static void main(String[] args) {
        char[] charArr = "IAmACompetitiveProgrammer".toCharArray();
        char[] newCharArr = new char[charArr.length];
        String word = "";

        newCharArr[0] = charArr[0];
        word += charArr[0];
        word += charArr[1];
        word += charArr[2];
        word += charArr[3];
        word += charArr[4];

        System.out.println(newCharArr);
        System.out.println(word);
    }
}
