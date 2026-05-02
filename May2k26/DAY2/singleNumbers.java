import java.util.Scanner;

public class singleNumbers {
    public static int singleNumber(int[] nums) {
        int result=0;
        for(int i=0; i<nums.length; i++){
            result = result^nums[i];
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int result = singleNumber(nums);
        System.out.println(result);
        sc.close();
    }
}
