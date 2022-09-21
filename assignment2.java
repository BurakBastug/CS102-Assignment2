
import java.util.Arrays;
import java.util.Scanner;
    
    
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

    public static int[] initArray(int size) {
        int[] arr = new int[size];

        for(int i=0; i<size; i++) {
            int rand = (int)(Math.random() * 101);
            arr[i] = rand;
        }
        return arr;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int choice;
        int size;
        int[] randArr;

        System.out.print("Inıtialize a new random array(0 to 100) with given size: ");
        size = scan.nextInt();
        randArr = initArray(size);

        do{
            System.out.println("(1) Find the mininmum of the array");
            System.out.println("(2) Find the maximum of the array");
            System.out.println("(3) Find the average of the array");
            System.out.println("(4) Display how each element of the array differs from the average");
            System.out.println("(5) Find the sum of elements with odd indexes");
            System.out.println("(6) Find the sum of elements with even indexes");
            System.out.println("(7) Display the array");
            System.out.println("(8) Exit");

            System.out.print("Enter a choice: ");
            choice = scan.nextInt();

            if(choice<1 || choice>8){
                System.out.println("Please enter a valid choice!");
            }
            else if(choice == 1){
                System.err.println("The minimum is: " + findMin(randArr));
            }
            else if(choice == 2){
                System.err.println("The maximum is: " + findMax(randArr));
            }
            else if(choice == 3){
                System.err.println("The average is: " + findAverage(randArr));
            }
            else if(choice == 4){
                System.err.println("Elements' difference from average is: " + Arrays.toString(findDifferenceFromAverage(randArr)));
            }
            else if(choice == 5){
                System.err.println("The sum of elements with odd indexes is: " + sumOdd(randArr));
            }
            else if(choice == 6){
                System.err.println("The sum of elements with even indexes: " + sumEven(randArr));
            }
            else if(choice == 7){
                System.err.println(Arrays.toString(randArr));
            }
        }
        while(choice != 8);

        scan.close();
        System.out.println("Goodbye!");
    }
}

    



