import java.util.Scanner;

public class increasingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long moves = 0;
        int prev = sc.nextInt();

        for (int i = 1; i < n; i++){
            int current = sc.nextInt();

            if (prev>current){
                moves += (prev-current);
                current = prev;
            }
            prev = current;
        }
        System.out.println(moves);
    }
}