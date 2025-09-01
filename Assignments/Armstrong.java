import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int len = (int)Math.log10(num) + 1; 
        int sum = 0;

        while(num > 0) {
            int rem = num % 10;
            sum += (int)Math.pow(rem, len);
            num /= 10;
        }

        if(sum == temp) {
            System.out.println(temp + " is an Armstrong Number");
        } else {
            System.out.println(temp + " is Not an Armstrong Number");
        }
    }
}
