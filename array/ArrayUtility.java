package array;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] insertElement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // inserting elements in array
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        return arr;
    }
}
