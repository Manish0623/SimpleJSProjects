import java.util.Scanner;
public class letter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

System.out.println("Enter a name:");
String name = sc.nextLine();

System.out.println("Dear " + name +" Thanks a lot");

String replace = name.replace("jaan","akbar"   );
System.out.println(replace + " I hate you");

    }
}
