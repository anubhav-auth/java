package ITER.Sem1.Assignment7;


import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int [] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("The distinct numbers are: ");
        eliminateDuplicates(arr);

    }

    public static int[] eliminateDuplicates(int[] list) {
        int c = -1;
        int x = c;
        int []arr = new int[list.length];



        for(int i = 0; i < list.length; i++) {
            for(int z = i+1; z < arr.length; z++) {
                if(contains(arr, list[i])) {
                    x = ++c;
                    arr[x] = list[i] ;
                }
            }

        }
        for(int i = 0; i <= x; i++) {
            System.out.print(arr[i] + " ");
        }
        return arr;

    }

    static boolean contains(int[] ar , int n) {
        for(int i = 0; i < ar.length; i++) {
            if(n == ar[i]) return false;
        }
        return true;
    }
}

