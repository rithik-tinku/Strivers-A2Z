import java.util.Arrays;

public class Insertion {
    public int[] insertionSort(int[] nums) {
        
        // Step 1: Outer loop -> ith element ni correct place lo insert cheyyali
        for( int i = 0; i<=nums.length-1; i++ ){
            
            // Step 2: j = i nunchi back side ki compare cheyyadam start cheyyali
            int j = i;
            
            // Step 3: j>0 (array start cross avvakudadhu) 
            //         && left element (nums[j-1]) > right element (nums[j]) unte swap cheyyali
            while(j>0 && nums[j-1]>nums[j]){
                
                // Step 4: Swap -> bigger element right ki move avthundi
                int temp = nums[j-1];
                nums[j-1] = nums[j];
                nums[j] = temp;
                
                // Step 5: Move one step left and continue checking
                j--;
            }
            // Step 6: After while loop, ith element correct position lo settle avutundi
        }
        
        // Step 7: Entire array sorted ayyaka return cheyyali
        return nums;
    }

    public static void main(String[] args) {
        Insertion i = new Insertion();
        int arr[]= {5, 4, 4, 1, 1};
        
        // Step 8: Arrays.toString use chesi sorted array ni human-readable format lo print cheyyali
        System.out.println(Arrays.toString(i.insertionSort(arr)));
    }
}
