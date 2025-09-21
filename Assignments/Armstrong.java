import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum=0;
        int len=(int)Math.log10(num)+1;
        while (num > 0) {
            int rem=num%10;
            sum+=(int)Math.pow(rem, len);
            num=num/10;
        }
        if(sum==temp){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }
}
