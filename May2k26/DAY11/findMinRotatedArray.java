import java.util.Scanner;
// same as findKthRotation.java but instead of returning the index of minimum element 
// we will return the minimum element
public class findMinRotatedArray {
    // not optimal solution
    public int notOptimal(int[] nums) {
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                return nums[i+1];
            }
        }
        return nums[0];
    }
    // optimal solution
    public int findMin(int[] nums) {
        int low =0; 
        int high =nums.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(nums[mid]>nums[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return nums[low];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        findMinRotatedArray obj = new findMinRotatedArray();
        System.out.println(obj.findMin(nums));
        sc.close();
    }
}
