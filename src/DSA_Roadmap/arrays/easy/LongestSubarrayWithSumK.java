package DSA_Roadmap.arrays.easy;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        int [] a = {1, 2, 3,1,1,1,1};
        int k = 3;
        int score;
        long temp = 0;
        long max = 0;
        for (int i = 0 ; i < a.length ; i++) {
            score = 0;
            score += a[i];
            if (a[i] == k){
                temp = 1;
            }
            for (int j = i+1 ; j < a.length ; j++){
                score += a[j];
                if (score == k) temp = j-i+1;
                else if (score > k) break;
            }
            if (temp > max) max = temp;

        }

        System.out.println(max);
    }

    static int hello (){
        int [] a = {1, 2, 3,1,1,1,1};
        int k = 3;
        long score;
        long temp = 0;
        long max = 0;

        for (int i = 0 ; i < a.length ; i++) {
            score = 0;
            score += a[i];
            if (a[i] == k){
                temp = 1;
            }
            for (int j = i+1 ; j < a.length ; j++){
                score += a[j];
                if (score == k) temp = j-i+1;
                else if (score > k) break;
            }
            if (temp > max) max = temp;

        }

        return (int) max;
    }
}
