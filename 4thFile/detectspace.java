import java.util.Scanner;

public class detectspace {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        if(str.contains("  ")){
            System.out.println("It contains double quotes");
        }
       else if (str.contains("   ")){
        System.out.println("It contains triple string..");
       }
    else{
        System.out.println(" no double or triple quotes ...");
    }
        }
    }

