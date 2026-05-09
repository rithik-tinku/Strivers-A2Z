import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class majorityElementII {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0, c2=0;
        int e1=Integer.MIN_VALUE, e2=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(c1==0 && e2!=nums[i]){
                c1=1;
                e1=nums[i];
            }
            else if(c2==0 && e1!=nums[i]){
                c2=1;
                e2=nums[i];
            }
            else if(nums[i]==e1){
                c1++;
            }
            else if(nums[i]==e2){
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int count1=0, count2=0;
        for(int i=0; i<nums.length; i++){
            if(e1==nums[i]){
                count1++;
            }
            if(e2==nums[i]){
                count2++;
            }
        }
        int min = (nums.length/3)+1;
        if(count1>=min){
            ans.add(e1);
        }
        if(count2>=min){
            ans.add(e2);
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        majorityElementII obj = new majorityElementII();
        System.out.println(obj.majorityElement(nums));
        sc.close();
    }
}
