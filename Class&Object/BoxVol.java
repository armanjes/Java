public class BoxVol {
    double height, width, depth; //instance variable
    /* 
    variables that are declared inside a class but outside of 
    a method are called instance variable.

    variables that are declared inside a 
    a method are called local variable.

    variables that are declared with static keyword are static variable.
     */
    //construcotr
    BoxVol(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    //method
    public void displayVol(){
        double volume = height* width* depth;
        System.out.println(volume);
    }
    public static void main(String[] args) {
        BoxVol obj1 = new BoxVol(10,10, 10);
        obj1.displayVol();

        BoxVol obj2 = new BoxVol(20,30, 10);
        obj2.displayVol();
    }
}
