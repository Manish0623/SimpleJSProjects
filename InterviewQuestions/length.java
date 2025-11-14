


import java.util.regex.*;

public class length {
    public static void main(String[] args) {
        String str = "what the hell";

        
        System.out.println("Using toCharArray(): " + str.toCharArray().length);

        
        System.out.println("Using lastIndexOf(\"\"): " + str.lastIndexOf(""));

    
        Matcher m = Pattern.compile("$").matcher(str);
        m.find(); 
        int len = m.end();
        System.out.println("Using regex: " + len);
    }
}

