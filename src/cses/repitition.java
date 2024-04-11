package cses;

import java.util.Scanner;

public class repitition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sequence = sc.nextLine();


        char [] array = new char[sequence.length()];

        for (int i = 0; i<sequence.length(); i++){
            array[i] = sequence.charAt(i);
        }


        int maxValue = 1;
        int output = 1;

//          a  t  t g g g c c

        for (int j = 0; j < sequence.length()-1; j++){

            if (array[j] == array[j+1]){
                output++;
            }else {
                output = 1;
            }

            if (output > maxValue ){
                maxValue = output;
            }
        }

        System.out.println(maxValue);
    }
}
