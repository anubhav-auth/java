package ITER.Sem1.Assignment6.homeAssignments;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("The first non-repeating character is: " + check("apple"));
    }
    public static char check(String str){
        char []b = str.toCharArray();
        int in = 0;


        for (int i = 0; i < b.length; i++){
            in = i;
            boolean z = true;
            for (int j = i+1; j <b.length ; j++) {
                if (b[i] == b[j]){
                    z = false;
                    break;
                }
            }
            if(z){
                break;
            }
        }
        return b[in];
    }
}
