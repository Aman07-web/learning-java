public class Prime {
    public static void main(String[] args) {
        int n = 50;
        for (int num=2; num<=n; num++) {
            int flag = 0;
            for (int i =2; i<=num/2; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(num + " ");
            }
        }
    }
}
