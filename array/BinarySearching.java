package array;

public class BinarySearching {
    public static int BinarySearch(int arr[], int target){
         int start=0, end =arr.length-1;
         while(start <= end){
            int mid=(start+end)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid] < target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
         }
         return -1;
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,7,12,34,54};
        int target=12;
        System.out.print("element found at location : "+BinarySearch(arr, target));
    }
}
