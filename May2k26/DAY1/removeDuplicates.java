import java.util.Scanner;

public class removeDuplicates {
    public static int removeDups(int[] nums) {
        int i =0;
            for(int j=1; j<nums.length; j++){
                if(nums[i]!=nums[j]){
                    nums[i+1]=nums[j];
                    i++;
                }
            }
        return i+1;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }

    int result = removeDups(arr);
    System.out.println(result);
    sc.close();
    }
}
