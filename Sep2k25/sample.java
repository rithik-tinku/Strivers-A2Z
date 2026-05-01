import java.util.*;

public class sample {
    public static void main(String[] args) {
        // counting frequencies
        int nums [] = {5,5,4,4,6};
        // for(int n : nums){
        //     m.put(n,m.getOrDefault(n,0)+1);
        // }
        TreeSet<Integer> s = new TreeSet<>();
        for(int i=0; i<nums.length; i++){
           s.add(nums[i]);
        }
        System.out.println(s);
    }
}
