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
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

}
