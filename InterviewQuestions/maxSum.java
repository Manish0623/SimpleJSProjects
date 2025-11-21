
public class maxSum {

    public static int maxSumarray(int[] arr, int k) {
        int windowSum = 0, maxSum = 0;

        // First window sum
        for (int i = 0; i < k; i++)
            windowSum += arr[i];

        maxSum = windowSum;

        // Slide the window
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 7, 1};
        int k = 3;
        System.out.println(maxSumarray(arr, k));
    }
}
