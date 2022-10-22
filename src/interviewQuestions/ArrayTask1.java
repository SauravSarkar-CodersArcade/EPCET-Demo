package interviewQuestions;

public class ArrayTask1 {
    public static void main(String[] args) {
        int[] arr = {1,2,5,4,7,8,11,20};
        //2,4,8,20,1,5,7,11
        resultantArray(arr);

    }
    public static void resultantArray(int[] arr){
        int[] resArray = new int[arr.length];
        int index = 0;
        for (int i=0; i< arr.length; i++){
            if (arr[i] % 2 == 0){
                resArray[index] = arr[i];
                index += 1;
            }
        }
        for (int i=0; i< arr.length; i++){
            if (arr[i] % 2 != 0){
                resArray[index] = arr[i];
                index += 1;
            }
        }

        for (int num : resArray){
            System.out.print(num + ",");
        }

    }
}
