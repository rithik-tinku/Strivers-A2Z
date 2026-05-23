import java.util.Scanner;

public class findPositionsUsingBS {
    //brute force approach
    public int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last =-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target){
                if(first==-1){
                    first =i;
                }
                last = i;
            }
        }
        return new int[]{first,last};
    }

    //optimal approach using binary search
    public int[] searchRangeOptimal(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first,last};
    }
    static int findFirst(int[]nums, int target){
        int low =0;
        int high = nums.length-1;
        int first = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                first = mid;
                high = mid -1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return first;
    }
    static int findLast(int[]nums, int target){
        int low =0;
        int high = nums.length-1;
        int last = -1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(nums[mid]==target){
                last = mid;
                low = mid +1;
            }
            else if(nums[mid]<target){
                low = mid+1;
            }
            else{
                high = mid -1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        findPositionsUsingBS fp = new findPositionsUsingBS();
        int[] result = fp.searchRangeOptimal(nums, target);
        System.out.println(result[0]+" "+result[1]);
        sc.close();
    }
}
