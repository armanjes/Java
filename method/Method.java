

/*
 method syntax:

    AccessModifer ReturnType MethodName(Arguments){
        method body
    }

 */



public class Method{
    // method with "static" AccessModifer can used from 
    //main method without creating object.
    static int add(int x, int y){
        return x+y;
    }
    // method with "public" AccessModifer can used only by creating object
    // from main method.

    public void speed(){
        System.out.println("Running at top speed.");
    }

    public static void main(String[] args) {
        System.out.println(add(10, 10));
        
        Method obj = new Method();
        obj.speed();

    }
}



// class/object
// attributes
// method (static, public)
// constructor