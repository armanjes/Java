public class array3 {
    public static void main(String[] args) {
        // average of array element

        int[] marks = {10, 10, 10, 20};

        int sum = 0;
        for(int i=0; i<marks.length; i++){
            sum = sum + marks[i];
        }
        System.out.print(sum/marks.length);
    }
}
