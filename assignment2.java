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

    public static void main(String[] args) {
        int[] arr = {-1,5,7,10,-7};
        System.out.println(findAverage(arr));

}
}

