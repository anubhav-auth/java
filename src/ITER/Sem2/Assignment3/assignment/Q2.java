package ITER.Sem2.Assignment3.assignment;

public class Q2 {
    public static void main(String[] args) {
        String[] favoriteColors = {"blue", "green", "red", "yellow", "purple"};

        try {

            System.out.println("Favorite color at index 10: " + favoriteColors[10]);

            if (favoriteColors[-1] == null) {
                throw new NullPointerException();
            }

        } catch (NullPointerException e) {

            System.out.println("Exception caught: Attempted to access an index that doesn't exist.");

        }catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Exception caught: Attempted to access an index beyond the array length.");

        }


    }
}
