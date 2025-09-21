package array;

public class Occurence {
    public static void main(String[] args) {
        int newArr[]=ArrayUtility.insertElement();
       // int sizeArray[]=new int[newArr.length+1];
       //find maximum element in array
       int max=newArr[0];
       for(int i=0; i<newArr.length; i++){
        if(newArr[i] > max){
            max=newArr[i];
        }
       }
       int sizeArray[]=new int[max+1];
       for(int i=0; i<sizeArray.length; i++){
        sizeArray[newArr[i]]++;
       }
       // print occurence of array is
       for(int i=0; i<sizeArray.length; i++){
        if(sizeArray[i] >=1){
            System.out.println("Elements Occurence of "+i+" = "+sizeArray[i]);
        }
       }
    }
}
