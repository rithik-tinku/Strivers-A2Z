import java.util.Scanner;

public class majorElement {
    public static int majorityElement(int[] nums) {
        int element =0;
        int count =0;
        for(int i=0; i<nums.length; i++){
            if(count==0){
                count =1;
                element =nums[i];
            }
            else if(nums[i]==element){
                count++;
            }
            else{
                count--;
            }
        }
        int counter=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==element){
                counter++;
            }
        }
        if(counter>(nums.length/2)){
            return element;
        }
        return -1;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int result = majorityElement(nums);
        System.out.print(result);
        sc.close();
    }
}
