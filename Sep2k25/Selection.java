import java.util.Arrays;

public class Selection {
    public int[] selectionSort(int[] nums) {
        // Step 1: Outer loop start -> ith position correct element place cheyali
        for( int i = 0; i<=nums.length-2; i++ ){// how many iterations
            // Step 2: Assume ith element e minimum ani
            int min = i;
            // Step 3: Check every element from i to end
            for(int j=i; j<=nums.length-1; j++){// from where to where
                // Step 4: If smaller element kanipiste, min index ni update cheyali
                if(nums[j]<nums[min]){
                    min=j;
                }
            }
            // Step 5: Swap -> min element ni ith place lo pettali
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
        }
        // Step 6: Entire array sorted ayyaka return cheyali
        return nums;
    }

    public static void main(String[] args) {
        Selection s = new Selection();
        int arr[]= {13, 46, 20, 24 ,52};
        // Step 7: Arrays.toString use chesi sorted array ni human-readable format lo print cheyyali
        System.out.println(Arrays.toString(s.selectionSort(arr)));
    }
}
