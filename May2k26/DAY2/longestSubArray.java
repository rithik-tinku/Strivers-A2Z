import java.util.HashMap;
import java.util.Scanner;

public class longestSubArray {
    public static int longestSubarray(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum =0;
        int len =0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(sum==k){
                len = i+1;
            }
            if(map.containsKey(sum-k)){
                int prevIndex = map.get(sum-k);
                int l = i-prevIndex;
                len = Math.max(len,l);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return len;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int result = longestSubarray(nums,k);
        System.out.println(result);
        sc.close();
    }
}
