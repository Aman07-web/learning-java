public class MissingNumber {
    public static void main(String[] args) {
        int nums[] = { 3, 0, 1 };
        int len = nums.length;
        int sum = 0;
        int res = len*(len + 1) / 2;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }
        int result = res - sum;
        
    }
}
