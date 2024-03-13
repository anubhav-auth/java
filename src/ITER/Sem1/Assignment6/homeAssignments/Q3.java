package ITER.Sem1.Assignment6.homeAssignments;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(checkMid("java"));
    }
    public static char checkMid(String str){
        int a = str.length();
        int mid;
        if (a%2 != 0){
            mid = (int)Math.ceil(a/2);
        }else mid = (a/2);

        return str.charAt(mid);
    }

}
