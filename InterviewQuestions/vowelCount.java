


public class vowelCount {


    public static boolean isVowel(char t) {
        return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' ||
               t == 'A' || t == 'E' || t == 'I' || t == 'O' || t == 'U';
    }

    public static void main(String[] args) {
        String str = "testing";
        int vCount = 0;

        for (int x = 0; x < str.length(); x++) {
            if (isVowel(str.charAt(x))) {   
                vCount++;
            }
        }

        System.out.println(vCount);
    }
}
