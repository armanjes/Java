public class MethodOverloading {

    // method with same name in a class with 
    // different numbers of arguments is called overloading

    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
    public int add(int n1, int n2, int n3, int n4){
        return n1+n2+n3+n4;
    }
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        int result = obj.add(10,10,1,1);
        System.out.println(result);
    }
}
