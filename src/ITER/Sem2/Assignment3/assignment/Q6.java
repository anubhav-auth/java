package ITER.Sem2.Assignment3.assignment;

public class Q6 {
    public static <T> int count(T[] array, T item) {
        int count = 0;
        for (T i : array) {
            if (i.equals(item)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        System.out.println(count(arr, 1));

    }
}
