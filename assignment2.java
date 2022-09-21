
import java.util.Arrays;
    
    
/**
 * assignment2
 */



public class assignment2 {

    public static double findAverage(int [] arr){
        double average = 0;
        double sum = 0; 
        
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        average = sum / arr.length;
        return average;
    }

    public static double[] findDifferenceFromAverage( int arr[] ) {
        double average=0;
        int sum=0;
        double differenceArr[]=new double [arr.length];
        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];            
        }
        average = sum/arr.length;

        for (int i = 0; i < arr.length; i++) {
            differenceArr[i] = (int) (arr[i]-average);
        }
        return differenceArr;
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

    public static int sumOdd(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(i%2 != 0){
                sum += arr[i];
            }
        }
        return sum;
    }
    
    public static int sumEven(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if(i%2 == 0){
                sum += arr[i];
            }
        }
        return sum;
    }
}

    



