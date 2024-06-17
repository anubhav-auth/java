package ITER.Sem2.Assignment3.Homeassignment;

import java.util.Scanner;

public class Q8 {
    static int moves;
    public static void TowerOfHanoi(int n, String source, String helper, String destination)
    {

        if(n==1)
        {
            System.out.println("Move Disk from " + source + " to " + destination);
            moves++;
        }
        else
        {
            TowerOfHanoi(n-1, source, destination, helper);
            System.out.println("Move Disk from " + source + " to " + destination);
            moves++;
            TowerOfHanoi(n-1, helper, source, destination);
        }


    }

    public static void main(String[] args) {
        String source = "A";
        String helper = "B";
        String destination = "C";
        System.out.println("Enter no. of disk");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TowerOfHanoi(n, source, helper, destination);

        System.out.println("No. of moves =" + moves);
    }

}
