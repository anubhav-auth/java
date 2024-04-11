package leetcode75;


import java.util.ArrayList;
import java.util.List;

public class mergeStringsAlternatively {
    public static String main(String[] args) {

        String word1 = "abc";
        String word2 = "bcd";

        List <Character> w1 = new ArrayList<>();
        List <Character> w2 = new ArrayList<>();
        StringBuilder sb = new StringBuilder();


        if (word1.length() > word2.length() || word1.length() == word2.length()) {

            for (int i = 0; i < word1.length(); i++) {
                w1.add(word1.charAt(i));
            }
            for (int i = 0; i < word2.length(); i++) {
                w2.add(word2.charAt(i));
            }


            for (int i = 0; i < word2.length(); i++) {

                sb.append(w1.get(0));
                w1.remove(0);
                sb.append(w2.get(0));
                w2.remove(0);
            }
            for (int i = 0; i < w1.size(); i++) {
                sb.append(w1.get(i));
            }

        }else {
            for (int i = 0; i < word1.length(); i++) {
                w1.add(word1.charAt(i));
            }
            for (int i = 0; i < word2.length(); i++) {
                w2.add(word2.charAt(i));
            }


            for (int i = 0; i < word1.length(); i++) {

                sb.append(w1.get(0));
                w1.remove(0);
                sb.append(w2.get(0));
                w2.remove(0);
            }
            for (int i = 0; i < w2.size(); i++) {
                sb.append(w2.get(i));
            }
        }
        return sb.toString();
    }

}

