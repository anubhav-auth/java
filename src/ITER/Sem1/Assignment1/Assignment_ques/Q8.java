package ITER.Sem1.Assignment1.Assignment_ques;

public class Q8 {
    public static void main(String[] args) {
        int x = 9;
        int y = 12;
        System.out.println("Before swap: x = " + x + ", y = " +y);

        x = x*y;
        y = x/y;
        x = x/y;
        System.out.println("After swap: x = " + x + ", y = " +y);
    }
}
