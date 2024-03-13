package ITER.Sem1.Assignment4.homeAssignment;

public class Q1 {
    public static void main(String[] args) {
        int sum1 = 0;
        for (int i = 1; i <= 10; i++) {
            sum1 = sum1 + (int)Math.pow(i,2);
            System.out.println("The sum of the squares of the first ten natural numbers is:"+sum1);
        }
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0; i <=10 ; i++) {
            sum2 = sum2 + i;
        }
        sum3 = (int)Math.pow(sum2,2);
        int sum = sum3-sum1;
        System.out.println("The square of the sum of the first ten natural numbers is:"+sum3);
        System.out.println("Hence the difference between the sum of the squares of the first\n" +
                "ten natural numbers and the square of the sum is: "+ sum );
    }
}
