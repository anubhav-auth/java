package ITER.Sem1.Assignment7;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integers and to mark the end enter 0: ");
        int [] a = new int[101];
        int o = 0;
        int z = -1;
        while (z != 0){
            z = sc.nextInt();
            a[o++] = z;
        }
        for (int i = 1; i <= 100; i++){
            int counter = 0;
            for (int j: a) {
                if (i == j)counter++;
            }
            if (counter >0){
                System.out.println(i + " occurs " + counter + ((counter>1)? " times." : " time."));
            }
        }



    }
}
