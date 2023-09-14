public class array2D {
    public static void main(String[] args) {
       /*int[][] numbers = new int[2][3];
        
        numbers[0][0] = 10;
        numbers[0][1] = 20;
        numbers[0][2] = 30;
        
        numbers[1][0] = 40;
        numbers[1][1] = 50;
        numbers[1][2] = 60;

        System.out.println(numbers[0][1]);

        for (int row=0; row<2; row++){
            for(int col=0; col<3; col++){
                System.out.print(" "+numbers[row][col]);
            }
            System.out.println();
        }*/
    
        int [][] digits = {
            {3,2,1}, {6,5,4}
        };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(digits[i][j]+" ");
            }
            System.out.println();
        }

    }
}
