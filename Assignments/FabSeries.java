import java.util.Scanner;

public class FabSeries{
    public static void main(String[] args) {
        System.out.println("Enter range of Fabonacci series: ");
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        int a=0,b=1,c;
         for(int i=1; i <=range; i++) {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}

