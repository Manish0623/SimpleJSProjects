public class replace {
    public static void main(String[] args){
        String name = "Nalanda and Taxila were the 1st two universities in the world";
        String replace = name.replace(" ","_");
        System.out.println(replace);

        String replaced = "_" + replace + "_";
        System.out.println(replaced);
    }
}
