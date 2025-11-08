import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of three subjects:");
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();

        if (sub1 >= 33 && sub2 >= 33 && sub3 >= 33) {
            int total = sub1 + sub2 + sub3;
            float percentage = (total / 300.0f) * 100;
            System.out.println("Your percentage is: " + percentage + " %");

            if (percentage >= 40) {
                System.out.println("You have passed the examination.");
            } else {
                System.out.println("You have failed the examination due to low overall percentage.");
            }
        } else {
            System.out.println("Since you have not scored at least 33 marks in each subject, you have failed the examination.");
        }

        sc.close(); 
    }
}

