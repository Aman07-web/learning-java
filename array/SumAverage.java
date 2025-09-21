package array;

import java.util.Scanner;

public class SumAverage {
    public static void main(String[] args) {
        System.out.print("enter the size of array: ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        // inserting element in array
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        //printing element
        System.out.print("Array elements: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
