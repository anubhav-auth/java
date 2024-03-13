package DSA_Roadmap.arrays.medium;

public class ContainerWithMostWater {
    public static void main(String[] args) {
//        int [] height = {1,8,6,2,5,4,8,3,7};
//        int [] height = {1,1};
        int [] height = {2,3,10,5,7,8,9};

        System.out.println(maxArea(height));

    }
    public static int maxArea(int[] height) {

        int max = 0;
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            int h = Math.min(height[i], height[j]);
            int width = j - i;
            max = Math.max(max, h * width);

            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }

        return max;
    }



}
