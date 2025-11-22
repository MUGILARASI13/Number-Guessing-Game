
import java.util.Scanner;

public class ReverseNumberGuessingGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Welcome to the Reverse Number Guessing Game!");
        System.out.println("Think of a number in your mind. Don't type it!");
        System.out.println("Just follow my instructions.\n");

        System.out.println("Step 1️: Multiply your number by 2.");
        System.out.print("Enter the result: ");
        int result1 = sc.nextInt();

        System.out.println("\nStep 2️: Now add 10 to that result.");
        System.out.print("Enter the new result: ");
        int result2 = sc.nextInt();

        int originalNumber = (result2 - 10) / 2;

        System.out.println("\n Calculating your number...");
        try { Thread.sleep(1500); } catch (Exception e) {}

        System.out.println("\n The number you thought is: " + originalNumber);

        sc.close();
    }
}
