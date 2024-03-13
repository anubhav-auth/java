import java.util.Scanner;

public class test {
    static int a = 10;
    int b;
        public static void main(String[] args) {
            int [] arr = new int[4];
            Scanner sc = new Scanner(System.in);

            int [] a ={1,2,3,5,6,7,8,9};
            int [] b = {5,6,8,7,9,4,6,1,2,3};

            
            System.out.println(sum(a));

        }

        public static int sum( int[] ar ){
            int sum = 0;
            for (int i = 0; i< ar.length; i++){
                sum += ar[i];
            }

            return sum;
        }
        public void subt(int a, int b){
            System.out.println(a-b);
        }

}

