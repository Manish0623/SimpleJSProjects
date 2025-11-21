public class numberToBinary {

    public static String toBinary(int num) {
        if (num == 0) return "0";

        StringBuilder binary = new StringBuilder();

        while (num > 0) {
            int bit = num % 2;
            binary.append(bit);
            num = num / 2;
        }
        return binary.reverse().toString();
    }

    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20};

        String[] binaryValues = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            binaryValues[i] = toBinary(numbers[i]);
        }

      
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " -> " + binaryValues[i]);
        }
    }
}
