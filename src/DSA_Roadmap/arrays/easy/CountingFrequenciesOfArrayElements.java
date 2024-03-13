package DSA_Roadmap.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class CountingFrequenciesOfArrayElements {
    public static void main(String[] args) {
//        int []arr = {10, 20, 20, 10, 10, 20, 5, 20};
        int []arr = {10, 20, 20};
        List<Integer> count = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!count.contains(arr[i])){
                count.add(arr[i]);
            }
        }

        for (int integer : count) {
            int a = 0;
            for (int k : arr) {
                if (integer == k) {
                       a++;
                }
            }
            System.out.println( integer + " " + a );
            a = 0;
        }
    }
}
