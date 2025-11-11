public class stringIsNumber {
    public static void main(String[] args) {
        String str = "1234567";
        boolean isNumber = true;

        // Check each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch < '0' || ch > '9') {
                isNumber = false;
                break;
            }
        }

        // Print result (this must be inside the main method)
        if (isNumber) {
            System.out.println("String contains only numbers.");
        } else {
            System.out.println("String contains alphabets or special characters.");
        }
    }
}

