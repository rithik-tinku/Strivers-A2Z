import java.util.Arrays;
import java.util.Scanner;

public class missingNumbers {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums[0] != 0){
        return 0;
        }
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]+1!=nums[i+1]){
                return nums[i]+1;
            }
        }
        return nums.length;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }

    int result = missingNumber(arr);
    System.out.println(result);
    sc.close();
    }
}
