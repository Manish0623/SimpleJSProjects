


public class missingNumber {
    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 6, 7};

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        int n = 7; // The range of numbers (1 to 7)
        int sum1 = 0;
        for (int j = 1; j <= n; j++) {
            sum1 = sum1 + j;
        }

        System.out.println("The missing number: " + (sum1 - sum));
    }
}

