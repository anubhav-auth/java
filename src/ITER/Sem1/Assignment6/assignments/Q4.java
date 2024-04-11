package ITER.Sem1.Assignment6.assignments;

public class Q4 {
    public static void main(String[] args) {
        for (int i = 2000; i <=2020; i++) {
            System.out.println("Number of days in " + i + " is " + numberOfDaysInAYear(i) + " days.");
        }
    }
    public static int numberOfDaysInAYear(int year){
        return (year%4 == 0 && year%100 != 0 || year%400 ==0)? 366:365;
    }
}
