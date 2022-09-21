/**
 * assignment2
 */

public class assignment2 {

    public static int findMin(int[] arr){
        int min = 101;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static int findMax(int[] arr){
        int max = -1;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    
}

    



