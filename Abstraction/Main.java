
abstract class Animal {
        abstract void sound();
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("bark!");
    }
}

class Lion extends Animal{
    @Override
    void sound(){
        System.out.println("rwar!");
    }
}


public class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        Lion lion = new Lion();
        lion.sound();
    }
}