
import java.util.Scanner;

public class if_else{

    public static void main(String[] args) {
    /*int num1 = 17;
    int num2 = 17;

    if (num1 == num2){
        System.out.print("equal.");
    }
    else if (num1> num2){
        System.out.print("num1 is greater.");
    }
    else{
        System.out.print("num2 is greater.");
    }*/

    Scanner number = new Scanner(System.in);

    System.out.print("Enter first digit: ");
    int digit1 = number.nextInt();

    if(digit1>0){
        System.out.print(digit1+" is largr than 0");
    }
    else{
        System.out.print(digit1+" is smaller than 0");
    }
    
    
}

}
