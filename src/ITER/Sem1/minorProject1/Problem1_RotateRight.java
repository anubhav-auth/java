package ITER.Sem1.minorProject1;

import java.util.Scanner;

public class Problem1_RotateRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no.of elements of the array: ");
        int a = sc.nextInt();
        System.out.print("enter the array elements(integers) with space in between them: ");
        int [] array = new int[a];
        //  {1,2,3}
        for (int i = 0; i < a; i++){
            array[i] = sc.nextInt();
        }

        rotateRightBy2Bits(array);

    }

    public static void rotateRightBy2Bits(int[] arr){
        String[] rotatedArrBin = new String[arr.length];  //rotated array elements in binary form
        String str = ""; //"00000000000000000000000000001010"

        System.out.print("Original Array: ");
        for (int i: arr){
            System.out.print(i + " ");
        }

        System.out.print("\nOriginal array in Binary: ");
        for (int i : arr) {
            String h = String.format("%32s", Integer.toBinaryString(i)).replace(' ', '0');
            System.out.print(h + " ");
            str += h; // "CC000000000000000000000000000010AA000000000000000000000000000010BB000000000000000000000000000011cc" +
        }

        str = str.substring(str.length()-2) + str;

        System.out.print("\nRotated array in binary : ");
        for (int i = 0; i < str.length()/32; i++){
            rotatedArrBin[i] = str.substring(i*32, i*32+32);
            System.out.print( rotatedArrBin[i] + " ");
        }

        System.out.print("\nRotated array in Decimal : ");
        for (String g: rotatedArrBin) {
            System.out.print((int)Long.parseLong(g,2)+" ");
        }

    }
}
