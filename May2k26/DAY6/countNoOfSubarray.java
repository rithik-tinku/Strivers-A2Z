import java.util.Scanner;

public class countNoOfSubarray {
long helper(int A[], long K){
        long count = 0;
        long sum = 0;
        int left = 0;
        for(int right = 0; right < A.length; right++){
            sum += A[right];
            // Shrink window if sum exceeds K
            while(sum > K){
                sum -= A[left];
                left++;
            }
            // Count all valid subarrays ending at right
            count += right - left + 1;
        }
        return count;
    }
    long countSubarray(int N, int A[], long L, long R) {
        return helper(A, R) - helper(A, L - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        long L = sc.nextLong();
        long R = sc.nextLong();
        countNoOfSubarray obj = new countNoOfSubarray();
        long ans = obj.countSubarray(n, arr, L, R);
        System.out.println(ans);
        sc.close();
    }
}
