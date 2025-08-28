 package array;
public class Largest {
    public static int largest(int arr[]){
        int maxNumber=Integer.MIN_VALUE;
        int smallNumber=Integer.MAX_VALUE;
        for(int i=0; i < arr.length; i++){
            if(maxNumber < arr[i]){
                maxNumber=arr[i];
            }
            if(smallNumber > arr[i]){
                smallNumber=arr[i];
            }
        }
        System.out.println("Smallest value is :"+smallNumber);
        return maxNumber;
    }
    public static void main(String[] args) {
        int arr[]={34,56,12,45,75,32};
        System.out.println("Largest value is : "+largest(arr));
    }
    
}
