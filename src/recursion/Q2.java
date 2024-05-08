package recursion;

public class Q2 {

    static void sort(int[] arr, int size){
        if (size>1){
            sort(arr,size/2);
            sort(arr,size/2);
        }
    }



    public static void main(String[] args) {
        int[] a = {2,5,1,5,8,3,9,5,3,46,6};

    }
}
