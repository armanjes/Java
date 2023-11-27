public class Methods {

    String first_name;
    String last_name;
    byte age;

    public void displayInfo(){
        System.out.println("First name: "+first_name);
        System.out.println("Last name: "+last_name);
        System.out.println("Age: "+age);
    }
    
    public static void main(String[] args) {

        Methods person = new Methods(); 

        person.first_name = "arman";
        person.last_name = "wanik";
        person.age = 19;

        person.displayInfo();
    }
}
