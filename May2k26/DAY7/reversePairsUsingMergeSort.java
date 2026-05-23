import java.util.ArrayList;
import java.util.Scanner;

public class reversePairsUsingMergeSort {
    //revrse pairs
    static int countPairs(int arr[], int low, int mid, int high){
        int right = mid+1;
        int count =0;
        for(int i=low; i<=mid; i++){
            while(right<=high && arr[i]>2L*arr[right]){
                right++;
            }
            count+=(right-(mid+1));
        }
        return count;
    }
    static void merge(int arr[], int low, int mid, int high){
        int left = low;
        int right = mid+1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        for(int i=low; i<=high; i++){
            arr[i]=temp.get(i-low);
        }
    }
    static int mergeSort(int arr[], int low, int high){
        int count =0;
        if(low>=high){
            return 0;
        }
        int mid = (low+high)/2;
        //count
        count+= mergeSort(arr, low, mid);
        count+= mergeSort(arr, mid+1, high);
        //reversepairs
        count+= countPairs(arr, low, mid, high);
        merge(arr,low,mid,high);
        return count;
    }
    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int ans = new reversePairsUsingMergeSort().reversePairs(arr);
        System.out.println(ans);
        sc.close();
    }
}

