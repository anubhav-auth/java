package ITER.Sem2.Assignment3.assignment;

public class Q10 {
    public static int fibonacci(int n){
        if (n <= 1 ) return 0;
        else if (n == 2 ) return 1;
        else return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}

