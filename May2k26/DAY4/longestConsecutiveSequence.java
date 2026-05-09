import java.util.HashSet;
import java.util.Scanner;

class longestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longest = 0;
        for(int num : set){
            if(!set.contains(num-1)){
            int curr = num;
            int count =1;
            while(set.contains(curr+1)){
                curr++;
                count++;
            }
            longest = Math.max(longest,count);
            }
        }
        return longest;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int longest = longestConsecutive(nums);
        System.out.println(longest);
        sc.close();
    }
}