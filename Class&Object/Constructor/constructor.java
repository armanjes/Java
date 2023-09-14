package Constructor;
public class constructor {
    
    String name, area;
    int phone;

    constructor(String n, String a, int p){
        name =n;
        area = a;
        phone = p;
    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Area: "+area);
        System.out.println("Phone: "+phone);
        System.out.println();
    }
}
