
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {

        Scanner personalDetails = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = personalDetails.nextLine();

        System.out.print("Enter age: ");
        int age = personalDetails.nextInt();

        System.out.print("Your phone number: ");
        int phoneNumber = personalDetails.nextInt();

        System.out.println();
        System.out.println("Name: "+name);
        System.out.println("You are: "+age);
        System.out.println("Your phone number is: "+phoneNumber);
    }
    
}