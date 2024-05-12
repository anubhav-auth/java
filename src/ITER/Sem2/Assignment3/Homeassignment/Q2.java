package ITER.Sem2.Assignment3.Homeassignment;


public class Q2 {
    public static int binSearch(int start, int end, int[] arr, int target){
        int mid = (start+end)/2;
        if (arr[mid] == target) return mid;
        else if (start == end && arr[mid] != target) return -1;
        else if (arr[mid] > target) return binSearch(start, mid, arr, target);
        else return binSearch(mid+1, end, arr, target);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,9,10,12,45,78,98,988};
        System.out.println(binSearch(0, arr.length-1, arr, 4));
    }
}
