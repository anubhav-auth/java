package ITER.Sem1.Assignment6.homeAssignments;

public class Q4 {
    public static void main(String[] args) {
        System.out.println("No of words in the String: " + count("The quick brown fox jumps over the lazy dog"));
    }
    public static int count(String str){
    char c[] = str.toCharArray();
    int counter = 1;
        for (int i = 0; i < c.length; i++) {
            if (c[i] == ' ') counter++;
        }
        return counter;
    }
}
