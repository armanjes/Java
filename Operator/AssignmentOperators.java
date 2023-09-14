public class AssignmentOperators {
    public static void main(String[] args) {
        // assignment operator =, +=, -=, *=, /=, %=

        int x = 10;
        int y = 2;

        x+=y; // x = x + y
        System.out.print(x);

        x-=y; // x = x - y
        System.out.print(x);

        x*=y;
        System.out.print(x);

        x/=y;
        System.out.print(x);

        x%=y;
        System.out.print(x);

        //////////////////////
        
        float n,m,j;
        n = m = j = 10.53f;
        System.out.print("n: "+n);
        System.out.print("m: "+m);
        System.out.print("j: "+j);
    }
}
