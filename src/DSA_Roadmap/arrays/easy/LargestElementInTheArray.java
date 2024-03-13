package DSA_Roadmap.arrays.easy;

public class LargestElementInTheArray {
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5};
        int n = a.length;

        System.out.println(largestElement(a, n));
    }

    static int largestElement(int[] arr, int n) {
        int highest = 0;

        for (int i = 0; i <n; i++) {
            if (arr[i] > highest){
                highest = arr[i];
            }
        }
        return highest;
    }
}
