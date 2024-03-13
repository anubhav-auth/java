package DSA_Roadmap.arrays.easy;

import static java.lang.System.exit;

public class SecondLargestElementInTheArray {
    public static void main(String[] args) {
//        int [] a = {1,2,-33,-44,5,5};
//        int [] a = {5,5,5,5,5};
        int [] a = {3};

        int n = a.length;

        System.out.println(secondLargestElement(a, n));
    }
    static int secondLargestElement(int[] arr, int n) {

        if (n <= 1){
            return -1;
        }

            int secondHighest = Integer.MIN_VALUE;
            int highest = Integer.MIN_VALUE;
            boolean same = true;
            int a = 0;

            for (int i = 0; i < n-1; i++) {
                if (arr[i] != arr[i + 1] && a < 2) {
                    same = false;
                    a = 2;
                }
            }

//        {1,2,-33,-44,5,5};

            for (int i = 0; i < n; i++) {

                if (arr[i] > highest) {
                    secondHighest = highest;
                    highest = arr[i];

                }
                else if (arr[i] > secondHighest && arr[i] != highest) {
                    secondHighest = arr[i];
                }

            }
            if (same){
                return -1;
            }else {
                return secondHighest;
            }
    }
}
