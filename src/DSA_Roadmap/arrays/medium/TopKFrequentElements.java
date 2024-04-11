package DSA_Roadmap.arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class TopKFrequentElements {
    public static void main(String[] args) {

    int [] a = {1,1,1,2,2,3};
    int k = 2;

//        topKFrequent(a, k);
        System.out.println(topKFrequent(a, k));
    }

    public static int[] topKFrequent(int[] nums, int k) {

        List<Integer> unique = new ArrayList<>();

        for (int i = 0 ; i < nums.length ; i++) {
            if (!unique.contains(nums[i])){
                unique.add(nums[i]);
            }
        }

        List<Integer>count_each = new ArrayList<>();

        for (int i = 0 ; i < unique.size() ; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == unique.get(i)){
                    count++;
                }
            }
            count_each.add(count);
        }

        List<Integer> counts = new ArrayList<>();
        List<Integer> used_index = new ArrayList<>();

        for (int i = 0 ; i < k ; i++) {

            int temp = 0;
            int index = 0;

            for (int j = 0; j < count_each.size() ; j++) {

                if (count_each.get(j) > temp && !used_index.contains(j)){
                    temp = count_each.get(j);
                    index = j;
                }
            }
            counts.add(unique.get(index));
            used_index.add(index);
        }

        int[] end = new int[k];
        for (int i = 0 ; i < k ; i++) {
            end[i] = counts.get(i);
        }
        return end;
    }
}
