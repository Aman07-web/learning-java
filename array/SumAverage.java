package array;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
       int numsArray[]=ArrayUtility.insertElement();
       long sum=sum(numsArray);
       int avg=average(numsArray);
       System.out.println("Sum of array: "+sum);
       System.out.println("Average : "+avg);
    }
    public static long sum(int [] numsArray){
        long sum=0;
        for(int i=0; i<numsArray.length; i++){
            sum+=numsArray[i];
        }
        return sum;
    }

    public static int average(int [] numsArray){
        long sum=sum(numsArray);
        return (int)(sum/numsArray.length);
    }
}
