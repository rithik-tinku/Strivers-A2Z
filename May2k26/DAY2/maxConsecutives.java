import java.util.Scanner;

public class maxConsecutives {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count =0;
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==1){
                count++;
                if(count>max){
                    max = count;
                }
            }
            else{
                count =0;
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
        int result = findMaxConsecutiveOnes(nums);
        System.out.println(result);
        sc.close();
    }
}
