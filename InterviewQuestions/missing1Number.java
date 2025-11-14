


public class missing1Number {
    public static int findMissingNumber(int[] num, int totalCount) {
        int expectedSum = totalCount * (totalCount + 1) / 2; 
        int actualSum = 0;

        for (int i : num) {
            actualSum += i;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 6};
        int missing = findMissingNumber(num, 6);
        System.out.println("Missing number is: " + missing);
    }
}

