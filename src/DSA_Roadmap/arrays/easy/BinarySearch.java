package DSA_Roadmap.arrays.easy;

public class BinarySearch {
    public static void main(String[] args) {
        int [] a = {1,2,4,6,5,54,65,4,6};
        System.out.println(search(a ,6));
    }

    public static int search(int[] nums, int target) {
        boolean found = false;
        int temp = -1;
        int index = -1;
        for(int i : nums) {

            temp++;
            if (i == target) {
                found = true;
                index = temp;
            }
        }
        if(found){
        return index;
        }else return -1;

    }
}
