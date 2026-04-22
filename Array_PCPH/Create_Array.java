

import java.util.Scanner;

public class Create_Array {
    public static class Array_create {
        int arr[];
        int idx = 0;

        Array_create(int size) {
            arr = new int[size];
        }

        // insert element in array
        public void add(int x) {
            if (idx < arr.length) {
                arr[idx] = x;
                idx++;
            } else {
                System.out.print("Array is full");
            }
        }
// reverse a array
       public void reverse(){
        int len=arr.length;
          for(int i=len-1; i>=0; i--){
            System.out.print(arr[i]+" ");
          }
       }
        // display the element of array
        public void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        Array_create obj=new Array_create(size);
        obj.add(12);
        obj.add(34);
        obj.display();
        System.out.println();
        obj.reverse();
    }
}
