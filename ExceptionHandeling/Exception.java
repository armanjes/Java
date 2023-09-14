package ExceptionHandeling;

public class Exception {
    public static void main(String[] args) {

        int x, y;

        x = 10; 
        y = 0;

        try{
            double z = x/y;
            System.out.print(z);
        }
        catch (ArithmeticException e){
            System.out.print("Exception: "+e);
        }
        finally{
            System.out.print("Thank you! ");
        }

    }
}
