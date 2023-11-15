
public class Constructor {
    
    String name;
    int age;

    Constructor(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        
        Constructor person = new Constructor("arman", 18);
        person.display();
        
    }
}
