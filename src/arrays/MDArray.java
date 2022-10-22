package arrays;
// Jagged Array
public class MDArray {
    public static void main(String[] args) {
        int[][] numbers = {{1,2,3,4,5,6},
                           {5,6,7,8},
                           {9,8,7,6,7}};

        for (int i=0; i< numbers.length; i++){ // rows
            for (int j=0; j<numbers[i].length; j++){ // columns
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
