package ITER.Sem2.Assignment3.assignment;

public class Q5 {
    public static < E > void printArray( E[] inputArray) {
        for(E element : inputArray) {
            System.out.print(" " + element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printArray(new Integer[]{1, 2, 3, 4, 5});
        printArray(new String[]{"hello", "hiii"});

    }
}
