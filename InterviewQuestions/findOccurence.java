

public class findOccurence {

    public static void Find(int[] arr, int target) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1) {
                    first = i;
                }
                last = i; 
            }
        }

        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 4, 9};
        int target = 4;

        Find(arr, target);
    }
}
