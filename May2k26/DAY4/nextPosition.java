import java.util.Scanner;

class nextPosition {
     private static void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        private static void reverse(int[] nums, int l, int r){
            while(l<r){
                swap(nums, l, r);
                l++;
                r--;
            }
        }
    public static void nextPermutation(int[] nums) {
        int ind = -1;
        int n = nums.length;
        for(int i=n-2; i>=0; i-- ){
            if(nums[i]<nums[i+1]){
                ind = i;
                break;
            }
        }
        if(ind == -1){
            reverse(nums,0,n-1);
            return;
        }
        for(int i=n-1; i>ind; i--){
            if(nums[i]>nums[ind]){
                swap(nums,i,ind);
                break;
            }
        }
        reverse(nums,ind+1,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        nextPermutation(nums);
        for(int i=0; i<n; i++){
            System.out.print(nums[i]+" ");
        }
        sc.close();
    }
}