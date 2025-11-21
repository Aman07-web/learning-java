package String;

public class Frequency {
    public static void main(String[] args) {
       int nums=36234554;
       int freq[]=new int[10];
       while (nums > 0) {
        int digits=nums%10;
        freq[digits]++;
        nums=nums/10;
       }
       System.out.println("Frequcies : ");
       for(int i=0; i<10; i++){
        if(freq[i] > 0){
            System.out.println(i+" = "+freq[i]);
        }
       }
       

    }
    
}
