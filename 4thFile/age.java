import java.util.Scanner;

public class age{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a random age:");
        int age = sc.nextInt();


        if(age>11){
            System.out.println("you are above 11");
        }
        else{
            System.out.println("you are below 11");
        }
    }
}