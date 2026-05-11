import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class chaarSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            for(int j=i+1; j<nums.length; j++){
                if(j>i+1 && nums[j]==nums[j-1]){
                    continue;
                }
                int k=j+1;
                int l=nums.length-1;
                while(k<l){
                    long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum<target){
                        k++;
                    }
                    else if(sum>target){
                        l--;
                    }
                    else{
                        List<Integer> temp = Arrays.asList(nums[i], nums[j],nums[k],nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while(k<l && nums[k]==nums[k-1]){
                            k++;
                        }
                        while(k<l && nums[l]==nums[l+1]){
                            l--;
                        }
                    }
                }
            }
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
        int target = sc.nextInt();
        chaarSum obj = new chaarSum();
        List<List<Integer>> ans = obj.fourSum(nums, target);
        for(List<Integer> list : ans){
            System.out.println(list);
        }
        sc.close();
    }
}
