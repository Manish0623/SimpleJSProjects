public class armStrong {
    public static boolean armstrong(int num) {
        int cube = 0;
        int r;
        int t = num;

        while (num > 0) {
            r = num % 10;         // Get last digit
            num = num / 10;       // Remove last digit
            cube += (r * r * r);  // Add cube of digit
        }

        if (t == cube) {
            System.out.println(t + " is an Armstrong number");
            return true;
        } else {
            System.out.println(t + " is not an Armstrong number");
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 153;  // 153 is an Armstrong number
        boolean result = armstrong(num);
        System.out.println("Result: " + result);
    }
}
