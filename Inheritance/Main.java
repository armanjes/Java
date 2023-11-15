// inheritence & method override
/*
method override: is declaring same method in child class that is already present
in the parent class is known as method override.
*/

class Vehical{
    double speed;
    void go(){
        System.out.println("This vehical is moving.");
    }
    void stop(){
        System.out.println("This vehical is stopped.");
    }
}

class Car extends Vehical{
    int wheels = 4;
    @Override
    void go(){
        System.out.println("This car is moving.");
    }
    @Override
    void stop(){
        System.out.println("This car is stopped.");
    }
}

class Bicycle extends Vehical{
    int wheels = 2;
    @Override
    void go(){
        System.out.println("This bicycle is moving.");
    }
    @Override
    void stop(){
        System.out.println("This bicycle is stopped.");
    }
}


public class Main {
    public static void main(String[] args) {
       Bicycle obj1 = new Bicycle();
       obj1.go();
       obj1.stop();
       System.out.println(obj1.wheels);

       Car obj2 = new Car();
       obj2.go();
       obj2.stop();
       System.out.println(obj2.wheels);

       Vehical obj3 = new Vehical();
       obj3.go();
       obj3.stop();
    }
}
