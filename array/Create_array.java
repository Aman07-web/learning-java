package array;

import java.util.Scanner;

public class Create_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
           arr[i]=sc.nextInt();
        }
        // printing element
        // for (int i : arr) {
        //     System.out.print(i+" ");
        // }

        // finding largest element in array
        // int largest=0;
        // for(int i=1; i<arr.length; i++){
        //     if(arr[largest] < arr[i]){
        //          arr[largest]=arr[i];
        //     }
        // }
        // System.out.println("Largest : "+arr[largest]);

        // int small=0;
        // for(int i=1; i < arr.length; i++){
        //     if(arr[small] > arr[i]){
        //         arr[small]=arr[i];
        //     }
        // }
        // System.out.print("Smallest : "+arr[small]);
    }

}
