/*
    class: is a blueprint and we can make multiple objects using class.
    object: is an instence of class.

    Types of class variable:
        1. static variable: variales that are declared inside a class with static keyword are called static variable.
        2. local variable: variables declared inside a method are called local variable.
        3. instance variable: variables declared inside class but outside of a method      called instance variable.

    method: is block of code that is execute when it is called.
    method syntax: 
        accessModifers returnType methodName(args){
            method body
        }

    constructor: is a special type of method which need not to call it calls itself when an object is created.Constructor name and class name should be same.It has no return type.

    method overloading: multiple methods with same in a class but with different parameters are method overloading. same case about constructor overloading.
*/

public class Main {

    String firstName, lastName; //instance variable
    int age; //instance variable

    //method
    public void displayInfo(){
        String bloodGroup = "A+"; // local variable
        System.out.println("Blood group: "+bloodGroup);
        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(age);
    }

    //constructor
    Main(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // method overloading
    public int add(int n1, int n2){
        return n1+n2;
    } public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    } public int add (int n1,int n2,int n3,int n4 ){
        return n1+n2+n3+n4;
    }

    // constructo overloading
    Main(){
        System.out.println("No info.");
    }
    Main(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }



    public static void main(String[] args) {

        // instancieating object
        Main obj1 = new Main("arman", "wanik", 18); 
        Main obj2 = new Main();
        Main obj3 = new Main("jack", "oggy");
        obj3.displayInfo();
        obj1.displayInfo(); //calling method
        //int result =  obj1.add(10, 10,1); //overloaded method call
        //System.out.println(result);
    }
}