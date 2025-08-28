package array;

public class BinarySearch {
    public static int binarySearch(int numbers[],int key){
       int start=0,end=numbers.length-1;
       while(start <= end){
        int mid=(start+end)/2;
        if(numbers[mid]==key){
            return mid;
        }
        if(numbers[mid] < key){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
       }
       return -1;
    }
    public static void main(String[] args) {
        int numbers[]={5,7,8,12,34,56,90,345};
        int key=34;
        System.out.println("Key found at :"+binarySearch(numbers, key));
    }
    
}
