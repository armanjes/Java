
import java.util.Scanner;

public class assignment2 {
    public static void main(String args[]){

        Scanner customerInput = new Scanner(System.in);

        System.out.print("Enter product ID: ");
        int ID = customerInput.nextInt();

        System.out.print("Enter product price: ");
        int Price = customerInput.nextInt();

        System.out.print("Enter title: ");
        String Title = customerInput.next();

        System.out.print("Enter description: ");
        String Description = customerInput.next();

        System.out.print("Enter catagory: ");
        String Catagory = customerInput.next();

        System.out.println();
        System.out.println("Id: "+ID);
        System.out.println("Price: "+Price);
        System.out.println("Title: "+Title);
        System.out.println("Description: "+Description);
        System.out.println("Catagory: "+Catagory);

    }
}
