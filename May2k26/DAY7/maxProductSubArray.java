import java.util.Scanner;

public class maxProductSubArray {
    public int maxProduct(int[] nums) {
        int suff=1; 
        int pref=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(pref==0){
                pref=1;
            }
            if(suff==0){
                suff=1;
            }
            pref = pref*nums[i];
            suff = suff*nums[nums.length-i-1];
            ans = Math.max(ans, Math.max(pref, suff));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        maxProductSubArray mpsa = new maxProductSubArray();
        System.out.println(mpsa.maxProduct(nums));
        sc.close();
    }
}
