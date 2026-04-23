

public class Reverse {
    public static void main(String[] args) {
        int arr[]={1,3,4,56,7};
        int size=arr.length;
        int left=0;
        int right=size-1;

        while(left < right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;

            left++;
            right--;
        }
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
