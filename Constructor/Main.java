public class Main {

    String name,gender;
    int age;

    Main(){
        System.out.println("No Information.");
    }
    Main(String n, String g, int a){
        name = n;
        gender = g;
        age = a;
    }
    Main(String n, String g){
        name = n;
        gender = g;
    }

    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        Main obj2 = new Main("arman", "male");
        Main obj3 = new Main("arman", "dlfj",14);
        obj2.display();
        obj3.display();
    }
}
