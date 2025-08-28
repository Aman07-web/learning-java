 package array;
public class Largest {
    public static int largest(int arr[]){
        int maxNumber=Integer.MIN_VALUE;
        for(int i=0; i < arr.length; i++){
            if(maxNumber < arr[i]){
                maxNumber=arr[i];
            }
        }
        return maxNumber;
    }
    public static void main(String[] args) {
        int arr[]={34,56,12,45,75,32};
        System.out.println("Largest value is : "+largest(arr));
    }
    
}
