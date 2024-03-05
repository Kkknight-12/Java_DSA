package Questions.String.Medium;

import java.util.Arrays;

public class LeetCodeStringCom {
    public static void main(String[] args) {
        char[] str = "aaarreeevv".toCharArray();
        int result = compress(str);
        System.out.println(result);
    }

    public static int compress(char[] chars) {
        int ans = 0, i = 0;
        while ( i < chars.length ) {
            char curr = chars[i];
            int count = 0;
            while ( i < chars.length && chars[i] == curr ) {
                i++;
                count++;
            }
            chars[ans++] = curr;
            System.out.println("before " + Arrays.toString(chars));
            if ( count != 1 ) {
                for ( char c : Integer.toString(count).toCharArray() ) {
                    chars[ans++] = c;
                }
            }
            System.out.println("RRRR " + Arrays.toString(chars));
        }
        return ans;
    }
}
