import java.util.HashSet;
import java.util.Scanner;


/*
the code i wrote---


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class distinctNumbers {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List< Integer> check = new ArrayList<>();

        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            if (!check.contains(num)){
                check.add(num);
            }
        }
        System.out.println(check.size());
    }
}
 */

public class distinctNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] values = new int[n];

        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }

        int distinctCount = countDistinctValues(values);
        System.out.println(distinctCount);

        scanner.close();
    }

    public static int countDistinctValues(int[] values) {
        HashSet<Integer> distinctSet = new HashSet<>();

        for (int value : values) {
            distinctSet.add(value);
        }

        return distinctSet.size();
    }
}
