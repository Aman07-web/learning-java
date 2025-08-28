package array;

public class LinearSearch {
    public static int linear(int arr[],int key){
        for(int i=0; i<arr.length; i++){
             if(arr[i]==key){
                return i;
             }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={12,23,45,22,10,5,4};
        int key=45;

        int index=linear(arr, key);
        if(index==-1){
            System.err.println("Not Found");

        }
        else{
            System.out.println("Element Found at : "+index);
        }
    }
    
}
