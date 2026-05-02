import java.util.Scanner;

class sortedRotated {
    public static boolean check(int[] nums) {
        int count =0;
        for(int i=1; i<nums.length; i++){
            if(nums[i]<nums[i-1]){
                count++;
            }
        }
            if(nums[0] < nums[nums.length-1]){
                count++;
            }
        return count<=1;
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean result = check(arr);
        System.out.println(result);
        sc.close();
    }
}


