import java.util.HashMap;
import java.util.Scanner;

public class longestSubarrayWithSumZero {
    int maxLength(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
            int sum =0;
            int maxlen=0;
            for(int i=0; i<arr.length; i++){
                sum+=arr[i];
                if(sum==0){
                    maxlen = i+1;
                }
                if(map.containsKey(sum)){
                    int len = i-map.get(sum);
                    maxlen = Math.max(maxlen,len);
                }
                else{
                    map.put(sum,i);
                }
            }
        return maxlen;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        longestSubarrayWithSumZero obj = new longestSubarrayWithSumZero();
        int ans = obj.maxLength(arr);
        System.out.println(ans);
        sc.close();
    }
}
