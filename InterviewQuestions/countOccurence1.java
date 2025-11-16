

public class countOccurence1 {

    public static int Count(int[] arr, int target) {
        int c = 0;
        for (int num : arr) {
            if (num == target) {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 2, 2, 5, 6};
        int target = 2;

        int result = Count(arr, target);
        System.out.println("Count: " + result);
    }
}
