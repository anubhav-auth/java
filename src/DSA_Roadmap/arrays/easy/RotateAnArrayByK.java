package DSA_Roadmap.arrays.easy;

public class RotateAnArrayByK {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        int k = 3;


        int n = nums.length;

        k = k % n; // In case k is greater than the length of the array

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];

        }

        for (int i = 0; i < n; i++) {
            nums[i] = rotated[i];
        }


    }
}
