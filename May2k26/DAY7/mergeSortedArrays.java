import java.util.Arrays;
import java.util.Scanner;
// not optimal solution
public class mergeSortedArrays {
        public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = Arrays.copyOf(nums1, m + n);
        for(int i = 0; i < n; i++){
            arr[m + i] = nums2[i];
        }
        Arrays.sort(arr);
        for(int i = 0; i < m + n; i++){
            nums1[i] = arr[i];
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); 
        int n = sc.nextInt();
        int[] nums1 = new int[m + n];
        for(int i = 0; i < m; i++){
            nums1[i] = sc.nextInt();
        }
        int[] nums2 = new int[n];
        for(int i = 0; i < n; i++){
            nums2[i] = sc.nextInt();
        }
        mergeSortedArrays obj = new mergeSortedArrays();
        obj.merge(nums1, m, nums2, n);
        for(int i = 0; i < m + n; i++){
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        sc.close();
    }
}
