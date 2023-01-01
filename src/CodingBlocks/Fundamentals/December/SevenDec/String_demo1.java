package CodingBlocks.Fundamentals.December.SevenDec;

public class String_demo1 {
    public static void main(String[] args) {


        String str = "abcdef";

        //
        // length
        System.out.println(str.length()); // 6

        //
        // charAt
        // access the ith character of string
        char ch = str.charAt(3);
        System.out.println(ch); // d

        // when you access index > length
//        System.out.println(str.charAt(7)); // String index out of range: 7

        //
        //  get last index
        System.out.println(str.charAt(str.length() - 1)); // f

        //
        // indexof property
        // indexof return the first index of matching char
        System.out.println(str.indexOf("c")); // 2

        // access element which don't exist in string
        System.out.println(str.indexOf("o")); // -1

        // can also search more than one char
        // return the index of starting char
        System.out.println(str.indexOf("cd")); // 2

        //
        // lastindexof
        String str2 = "abcdefcd";
        System.out.println(str2.lastIndexOf("cd")); // 6

        //
        // startsWith
        System.out.println(str.startsWith("ad")); // false

        System.out.println(str.startsWith("ab")); // true

        //
        // endsWith
        System.out.println(str.endsWith("ef")); // true
    }
}
