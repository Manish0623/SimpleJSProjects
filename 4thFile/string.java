public class string {
    public static void main(String[] args){
        String name = new String("Netaji Subhash Chandra bose");
        System.out.println(name);

int value = name.length();
System.out.println(value);

String upper = name.toUpperCase();
System.out.println(upper);

System.out.println(name.substring(0,10));
System.out.println(name.replace("Ne","Pe"));
    }
}
