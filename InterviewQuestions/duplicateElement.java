

import java.util.LinkedHashSet;

public class duplicateElement {

    public static int[] Remove(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Add elements to set → removes duplicates automatically
        for (int num : arr) {
            set.add(num);
        }

        // Convert set back to array
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 5, 4, 4};

        int[] unique = Remove(arr);

        // Print result
        System.out.print("Array without duplicates: ");
        for (int num : unique) {
            System.out.print(num + " ");
        }
    }
}
