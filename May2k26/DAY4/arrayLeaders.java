import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrayLeaders {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=n-1; i>=0; i--){
            if(max<=arr[i]){
                max = arr[i];
                result.add(max);
            }
        }
        Collections.reverse(result);
        return result;
    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        ArrayList<Integer> leaders = leaders(nums);
        for(int leader : leaders){
            System.out.print(leader + " ");
        }
    }
}
