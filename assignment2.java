<<<<<<< HEAD
import java.util.Arrays;
    
    public static double findAverage(int [] arr){
        double average = 0;
        double sum = 0; 
        
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        average = sum / arr.length;
        return average;
    }
/**
 * assignment2
 */
public class assignment2 {
}

/**
 * assignment2
 */
public class assignment2 {
public class assignment2 {

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

        int arr[] = {5,10,15,20,25};

        System.out.println(Arrays.toString(findDifferenceFromAverage(arr)));
=======
>>>>>>> parent of a974b56... Merge pull request #2 from goktugsyildirim/gok2s







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

    



