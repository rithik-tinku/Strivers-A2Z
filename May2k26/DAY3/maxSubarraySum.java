import java.util.Scanner;

public class maxSubarraySum {
    public static int maxSubArray(int[] nums) {
        int sum =0;
        int max =Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            if(max<sum){
                max = sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int result = maxSubArray(nums);
        System.out.print(result);
        sc.close();
    } 
}
