package ITER.Sem1.Assignment7;

public class Q6 {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.print("Original array : ");
        for (int i:arr) {
            System.out.print(i + " ");
        }
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            // Swap elements at indices i and j
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            // Move indices towards the center
            i++;
            j--;
        }
        System.out.print("\nRotated array : ");
        for (int k:arr) {
            System.out.print(k + " ");
        }
        switch (i){
            case 0: {}
            break;
            default:
        }
    }
}
