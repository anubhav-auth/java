package DSA_Roadmap.arrays.easy;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] a = {3,2,4};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(a, target)));
    }
    static public int[] twoSum(int[] nums, int target) {

        int []arr = new int[2];
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j <nums.length ; j++) {
                if ((nums[i] + nums[j]) == target){
                    if (i != j){
                   arr[0] = j;
                   arr[1] = i;
                    }
                }
            }
        }

        return arr;
    }
}
