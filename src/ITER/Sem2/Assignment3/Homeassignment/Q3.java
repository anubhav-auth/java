package ITER.Sem2.Assignment3.Homeassignment;


public class Q3 {
    public static void binary(int n){
        if (n == 0) System.out.print(0);
        else {
            if (n%2 == 0){
                binary(n/2);
                System.out.print(0);
            }else{
                binary(n/2);
                System.out.print(1);
            }
        }
    }

    public static void main(String[] args) {
        binary(5);
    }
}
