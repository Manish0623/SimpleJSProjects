

public class checkElement {

    public static boolean Element(int[] arr, int x) {
        for (int num : arr) {
            if (num == x) {
                return true;    // found → return true
            }
        }
        return false; // checked whole array → not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 31, 55, 44};
        int x = 31;

        boolean result = Element(arr, x);
        System.out.println(result);
    }
}
