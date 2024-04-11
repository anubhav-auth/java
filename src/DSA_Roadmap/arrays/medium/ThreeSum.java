package DSA_Roadmap.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {

        int [] a = {-1,0,1,2,-1,-4};
//        int [] a = {0,1,1};
//        int [] a = {0,0,0};
        System.out.println(threeSum(a));

    }

    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> end = new ArrayList<>();

        for (int j = 0; j < nums.length; j++) {
            int target = -nums[j];

            for (int i = 0; i < nums.length; i++) {
               if (j != i){

               }
            }

        }

        return end;

    }
}
