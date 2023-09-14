public class oop {

    int Session, Batch;
    String Name;

    void display(){
        System.out.println("Name: "+Name);
        System.out.println("Session: "+Session);
        System.out.println("Batch: "+Batch);
        System.out.println();
    }

    void displayInfo(String n,int s,int b){
        Name = n;
        Session = s;
        Batch = b;
    }
}