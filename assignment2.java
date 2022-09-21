/**
 * assignment2
 */

public class assignment2 {

    public static void main(String[] args) {
        int arr[] = {5,2,4,7,8};
        System.out.println(findMin(arr));
        System.out.println(findMax(arr));
        

        
    }
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

    



