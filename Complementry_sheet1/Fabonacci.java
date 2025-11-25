package Complementry_sheet1;

import java.util.Scanner;

public class Fabonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a=0, b=1;
        for(int i=0; i<=num; i++){
             System.out.print(" Fanonacci Series : " +a+" ");
            int c=a+b;
            a=b;
            b=c;  
        }
         
    }
}
