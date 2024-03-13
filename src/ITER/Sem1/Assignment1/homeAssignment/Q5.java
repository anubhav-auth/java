package ITER.Sem1.Assignment1.homeAssignment;

public class Q5 {
    public static void main(String[] args) {
        int w = 3, g = 5, k = 7, a = 9;
        System.out.println("Before swapping: w = " + w + ", g = " + g + ", k = " + k + ", a = " + a);
//      swap w&g
        w = w*g;
        g = w/g;
        w = w/g;

//      swap g&k
        g = g*k;
        k = g/k;
        g = g/k;

//        swap k&a
        k = k*a;
        a = k/a;
        k = k/a;

        System.out.println("After swapping: w = " + w + ", g = " + g + ", k = " + k + ", a = " + a);
    }
}
