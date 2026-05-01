import java.util.*;

public class highestFreq {
    public int mostFrequentElement(int[] nums) {
     Map<Integer, Integer> m = new HashMap<>();
        // counting frequencies
        for(int n : nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }
        //sorting for values
        TreeSet<Integer> s = new TreeSet<>();
        for(int i=0; i<nums.length; i++){
           s.add(m.get(nums[i]));
        }
        //to print key<K> using value<V>
        for (Map.Entry<Integer, Integer> e : m.entrySet()) {
            if (e.getValue().equals(s.last())) { // we can use getValue or getKey only in Map.Entry
                return (e.getKey());
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        highestFreq h = new highestFreq();
        int nums [] = {5,5,4,4,3,3,6};
        System.out.println(h.mostFrequentElement(nums));

    }
}
