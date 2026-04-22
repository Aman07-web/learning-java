package Complementry_sheet1;
public class Unique {
    public static void main(String[] args) {
        int num=7342352;
        int fre[]=new int[10];
        while(num > 0){
            int rem=num%10;
            fre[num]++;
            num=num/10;
        }
        for(int i=0; i<fre.length;i++){
            System.out.println(i+" => "+fre[i]);
        }

    }
}
