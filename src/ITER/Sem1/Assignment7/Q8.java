package ITER.Sem1.Assignment7;

import java.util.Scanner;

public class Q8 {
    static int [] array;
    static boolean in = true;
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        if (!in)return;

        while(in) {
            System.out.println("\n\n");
            System.out.println("a. Create an array of N integers\n" +
                    "b. Display the array elements\n" +
                    "c. Insert an element at specific position\n" +
                    "d. Delete an element at a given position\n" +
                    "e. Exit");
            char a = sc.next().charAt(0);

            switch (a) {
                case 'a' -> createAArrayOfNIntegers();
                case 'b' -> displayTheArrayElements();
                case 'c' -> insertElement();
                case 'd' -> deleteElement();
                case 'e' -> in = false;
            }
        }

    }
    static void createAArrayOfNIntegers(){
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int [] a = new int[n];
        System.out.print("Enter "+n+" array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        array = a;

    }
    static void displayTheArrayElements(){
        System.out.print("Array elements are: ");
        for (int j:array) {
            System.out.print(j + " ");
        }

    }
    static void insertElement(){

        System.out.print("Enter index where you wanna insert: ");
        int i = sc.nextInt();
        System.out.print("Enter the element you wanna insert");
        array[i] = sc.nextInt();
        displayTheArrayElements();
    }
    static void deleteElement(){
        System.out.print("Enter index where you wanna delete: ");
        int i = sc.nextInt();
        array[i] = -1;
        displayTheArrayElements();
    }
}
