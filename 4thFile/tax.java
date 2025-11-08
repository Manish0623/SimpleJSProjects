import java.util.Scanner;
public class tax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter you income ");
        int income = sc.nextInt();


        if(income >=250000 && income<=500000){
            float tax  = (income*5)/100;
System.out.println(" you have to pay " + tax);

        }
        else if(income>=500000 && income<=1000000){
            float tax1 = (income*20)/100;
            System.out.println(" you have to pay " + tax1);
        }

        else if(income>1000000){
            float tax2 = (income*30)/100;
            System.out.println(" you have  to pay " + tax2);
        }
        else{
            System.out.println(" you dont have to pay any tax..");
        }
    }
}
