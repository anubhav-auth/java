package ITER.Sem2.Assignment3.assignment;

public class Q9 {
    public static int reversed(int n){
        if (n/10 == 0) return n;
        else {
            System.out.print(n%10);
            return (reversed(n/10));
        }
    }

    public static void main(String[] args) {
        System.out.println(reversed(24638));
    }
}
