package DSA_Roadmap.Sorting_Searching.easy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFirstAndLastPositionOfElementInSortedArray{
    public static void main(String[] args) {

    }
    public int[] searchRange(int[] nums, int target){

        int [] result = {-1, -1};

        result[0] = binarySearch(nums,target, true);

        if (result[0] == -1){
            return result;
        }
        result[1] = binarySearch(nums,target,false);
        return result;
    }

    static int  binarySearch(int [] nums, int target, boolean isTrue ){
        int start = 0;
        int result = -1;
        int end = nums.length-1;

        while (start <= end) {
            int mid = start + (end-start)/2;
            if (nums[mid] == target) {
                result = mid;
                if (isTrue) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;

    }
}
