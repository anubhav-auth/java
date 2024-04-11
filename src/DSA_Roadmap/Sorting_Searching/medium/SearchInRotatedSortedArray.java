package DSA_Roadmap.Sorting_Searching.medium;

import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
    int [] arr = {4,5,6,7,0,1,2};
    int tar = 0;

        System.out.println(search(arr, tar));
    }
    public static int search(int[] nums, int target) {
        int result = -1;
        int []newArray = new int[nums.length];

        System.arraycopy(nums, 0, newArray, 0, nums.length);

        Arrays.sort(newArray);

        int start = 0, end = newArray.length;

        while (start < end) {
            int mid = start + (end - start)/2;

            if (newArray[mid] == target){
                return mid;
            } else if (newArray[mid] > target) {
                end = mid -1;
            }else {
                start = mid + 1;
            }
        }

        return result;
    }
}
