

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> tvSet = new ArrayList<String>();

        tvSet.add("Samsung");
        tvSet.add("Iball");
        tvSet.add("LG");

        tvSet.forEach(show -> {
            System.out.println(show);
        });
    }
}
