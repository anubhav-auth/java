package cses;

import java.util.Scanner;

public class permutation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();

        if (b == 2 || b == 3){
            System.out.println("NO SOLUTION");
            return;
        }

        StringBuilder stringBuildereven = new StringBuilder();
        StringBuilder stringBuilderodd = new StringBuilder();

            while (b != 0) {
                if (b % 2 == 0) {
                    stringBuildereven.append(b).append(" ");
                    b--;
                } else {
                    stringBuilderodd.append(b).append(" ");
                    b--;
                }
            }


        stringBuilderodd.append(stringBuildereven);

        System.out.println(stringBuilderodd);

        }

 }

