import java.util.ArrayList;
import java.util.Arrays;

public class Merge {
    public int[] merge(int[] arr, int low, int mid, int high){
        // Step 1: Temp list create chesam merged result store cheyyadaniki
        ArrayList<Integer> temp = new ArrayList<>();
        
        // Step 2: Divide array into 2 halves:
        //   1st half = low to mid
        //   2nd half = mid+1 to high
        int left = low;     // pointer for 1st half
        int right = mid+1;  // pointer for 2nd half
        
        // Step 3: Compare both halves and pick smaller element first
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
        
        // Step 4: If left half lo elements remaining unna, add them
        while(left<=mid){
            temp.add(arr[left]);
            left++;
        }
        
        // Step 5: If right half lo elements remaining unna, add them
        while(right<=high){
            temp.add(arr[right]);
            right++;
        }
        
        // Step 6: Copy merged result back into original array (low to high positions)
        for(int i= low ; i<=high; i++){
            arr[i] = temp.get(i-low); // i-low ante temp starting index match avvadaniki
            // and .get enduku ante beacuse it is in arraylist 
        }
        return arr;
    }
    
    public int[] mergeSort(int[] arr, int low , int high){
        // Step 1: Base case -> single element unna array already sorted
        if(low == high){
            return arr;
        }
        
        // Step 2: Divide array into two halves (find mid)
        int mid = (low+high)/2;
        
        // Step 3: Sort left half recursively
        mergeSort(arr, low , mid);
        
        // Step 4: Sort right half recursively
        mergeSort(arr, mid+1, high);
        
        // Step 5: Merge two sorted halves
        merge(arr, low, mid, high);
        
        return arr;
    }
    
    public static void main(String[] args) {
        Merge m = new Merge();
        int arr[] = {3, 2, 3, 4, 5};
        
        // Step 6: Arrays.toString use chesi final sorted array print cheyyali
        System.out.println(Arrays.toString(m.mergeSort(arr,0,arr.length-1)));
    }
}
