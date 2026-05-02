import java.util.Scanner;

public class moveZeroesToRight {
    public static void moveZeroes(int[] nums) {
        int j = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
               j = i;
               break; 
            }
        }
        //java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 1
        if(j == -1){ 
            return;
        }
        for(int i=j+1; i<nums.length; i++){
            if(nums[i]!=0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        moveZeroes(arr);
        for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
