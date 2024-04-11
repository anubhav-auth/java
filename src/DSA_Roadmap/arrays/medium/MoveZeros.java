package DSA_Roadmap.arrays.medium;

public class MoveZeros {
    public static void main(String[] args) {
        int [] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {

        int [] num = nums;

        int ind = 0;

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] != 0){
                num[ind] = nums[i];
                ind++;
            }
        }
        for (int i = ind; i < num.length ; i++) {
            num[i] = 0;
        }

    }
}
