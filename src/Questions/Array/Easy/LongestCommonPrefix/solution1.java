package Questions.Array.Easy.LongestCommonPrefix;

public class solution1 {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{ "flower", "flow", "flight" }));
    }

    public static String longestCommonPrefix(String[] strs) {
        if ( strs == null || strs.length == 0 )
            return "";
        int minLen = Integer.MAX_VALUE;
        for ( String str : strs ) {
            minLen = Math.min(minLen, str.length());
        }
        int low = 1;
        int high = minLen;
        while ( low <= high ) {
            int middle = (low + high) / 2;
            if ( isCommonPrefix(strs, middle) ) { // string array is passed
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return strs[0].substring(0, (low + high) / 2);
    }

    private static boolean isCommonPrefix(String[] strs, int len) {
        // take prefix from first element
        String str1 = strs[0].substring(0, len);

        // as we have already accessed 1st element
        // start iteration from second element
        for ( int i = 1; i < strs.length; i++ ) {
            if ( !strs[i].startsWith(str1) ) {
                return false;
            }
        }
        return true;
    }
}
