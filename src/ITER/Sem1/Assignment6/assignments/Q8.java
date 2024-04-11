package ITER.Sem1.Assignment6.assignments;

public class Q8 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Iti"));
    }
    public static boolean isPalindrome(String str){
       String s = "";
       for (int i = 0; i < str.length(); i++){
           s = str.charAt(i)+s;
       }
        System.out.println(s);
       return str.equals(s);
    }
}
