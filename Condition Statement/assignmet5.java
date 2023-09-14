
import java.util.Scanner;

public class assignmet5 {
    public static void main(String args[]){

        Scanner voter = new Scanner(System.in);

        System.out.print("Enter any integer digit: ");
        int person = voter.nextInt();

        if (person % 2 == 0){
            System.out.print("Even.");
        }
        else{
            System.out.print("Odd.");
        }

    }
}
