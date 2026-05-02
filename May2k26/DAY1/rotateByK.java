import java.util.Scanner;

public class rotateByK {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k% n;
        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);
    }
    public static void reverse(int [] nums, int start, int end){
            while(start<end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        rotate(arr,k);
        for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
