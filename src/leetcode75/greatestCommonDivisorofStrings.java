package leetcode75;

import java.util.ArrayList;
import java.util.List;

public class greatestCommonDivisorofStrings {
    public static void main(String[] args) {

        String str1 = "ABCABC";
        String str2 = "ABC";

        List<Character> s1 = new ArrayList<>();
        List<Character> s2 = new ArrayList<>();

        for (int i = 0; i < str1.length() ; i++) {
            s1.add(str1.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            s2.add(str2.charAt(i));
        }

        



    }
}
