import java.util.Arrays;

public class bubble {
    public int[] bubbleSort(int[] nums) {
        
        // Step 1: Outer loop -> last element nundi 1st element varaku run avvali
        //          Each round lo biggest element end ki "bubble" ayyi velthundi
        for( int i = nums.length-1; i>=1; i-- ){// how many iterations
            int didSwap =0;
            // Step 2: Inner loop -> 0 nundi i-1 varaku compare chestam
            for(int j=0; j<=i-1; j++){// from where to where
                
                // Step 3: If left element > right element, swap cheyyali
                //          So smaller element left ki move avthundi
                if(nums[j]>nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                    didSwap =1;
                }
            }
            if(didSwap ==0){
                break; // done this beacuse to optimize TC
            }
            // Step 4: After each outer loop, biggest element correct place ki vellipothundi
        }
        
        // Step 5: Final sorted array return chestam
        return nums;
    }

    public static void main(String[] args) {
        bubble b = new bubble();
        int arr[]= {13, 46, 20, 24 ,52, 9};
        
        // Step 6: Arrays.toString use chesi sorted array ni human-readable format lo print cheyyali
        System.out.println(Arrays.toString(b.bubbleSort(arr)));
    }
}
