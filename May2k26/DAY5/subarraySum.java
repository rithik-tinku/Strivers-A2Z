import java.util.HashMap;
import java.util.Scanner;

class subarraySumK{
    public int subarraySum(int[] nums, int k) {
        int count =0;
            for(int i=0; i<nums.length; i++){
               int sum =0;
               for(int j=i; j<nums.length; j++){
                    sum+=nums[j];
                    if(sum==k){
                    count++;
                }
               }
            }
        return count;
    }
    
    public int optimalSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // prefix sum 0 occurred once
        map.put(0, 1);
        int preSum = 0;
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            preSum += nums[i];
            int remove = preSum - k;
            // if remove exists, add its frequency
            if(map.containsKey(remove)){
                count += map.get(remove);
            }
            // store/update current prefix sum frequency
            map.put(preSum, map.getOrDefault(preSum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        subarraySumK obj = new subarraySumK();
        System.out.println(obj.subarraySum(nums, k));
        sc.close();
    }
}
