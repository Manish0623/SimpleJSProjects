
import java.util.*;
import java.util.stream.Stream;

public class concatArray {
    public static void main(String[] args) {
        String[] name = {
            "rohit",
            "virat",
            "suresh",
            "MS"
        };

        String[] surname = {
            "sharma",
            "kholi",
            "Dhoni"
        };

        Stream<String> sName = Arrays.stream(name);
        Stream<String> sTitle = Arrays.stream(surname);

        String[] fullname = Stream.concat(sName, sTitle)
                                  .toArray(String[]::new);

        for (String s : fullname) {
            System.out.print(s);
        }
    }
}
