package ITER.Sem2.Assignment1.assignment;

import java.util.*;

public class Q4 {
    static int fac(int n) {
        int fact = 1;
        for (int i = n; i > 1; i--) {
            fact *= i;
        }
        return fact;
    }
    static void unique(char[]arr){
        HashSet<ArrayList<Integer>> hsa = new HashSet<>();
        Random ra = new Random();

        while (hsa.size() <= fac(arr.length)) {

            ArrayList<Integer> ar = new ArrayList<>();

            while (ar.size() <= arr.length){
                int r = ra.nextInt(arr.length);
                if(!ar.contains(r)){
                    ar.add(r);
                }
                if (ar.size() == arr.length) break;
            }

            hsa.add(ar);
            if (hsa.size() == fac(arr.length)) break;
        }

        int counter = 0;
        for (ArrayList<Integer> a: hsa) {
            String s = "";
            for (int b: a) {
                s += arr[b];
            }
            counter++;
            System.out.print(s + " ");
            if (counter%10 == 0) System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String whose unique combination you want: ");
        String s = sc.nextLine();
        unique(s.toCharArray());
    }


}




