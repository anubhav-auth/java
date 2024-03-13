package DSA_Roadmap.Sorting_Searching.medium;

public class FindPeakElement {
    public static void main(String[] args) {

        int [] arr = {1,2,3,1};
        System.out.println(peakIndexInMountainArray(arr));


    }

    public static int peakIndexInMountainArray(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }
}
