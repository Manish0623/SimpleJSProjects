
import java.util.Scanner;

public class chatBot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! I am ChatBot. Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = sc.nextLine().toLowerCase();

            if (userInput.contains("bye")) {
                System.out.println("Bot: Goodbye! Have a nice day 😊");
                break; // exit the loop when user says bye
            } else if (userInput.contains("hello") || userInput.contains("hi")) {
                System.out.println("Bot: Hello there! How can I help you?");
            } else if (userInput.contains("how are you")) {
                System.out.println("Bot: I'm just code, but I'm running fine!");
            } else {
                System.out.println("Bot: Sorry, I didn’t understand that.");
            }
        }

        sc.close();
    }
}

