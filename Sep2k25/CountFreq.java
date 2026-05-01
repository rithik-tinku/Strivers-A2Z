import java.util.*;

public class CountFreq {

    public List<List<Integer>> countFrequencies(int[] nums) {
        Map<Integer, Integer> m = new HashMap<>();
        // counting frequencies
        for(int n : nums){
            m.put(n,m.getOrDefault(n,0)+1);
        }

        //Converting Map -> List
        List<List<Integer>> result = new ArrayList<>();
        for(int key : m.keySet()){ 
            // m lo unna prathi unique keys ni fetch chesthadi
            int freq = m.get(key);
            // frequencies fetch chesthadi from key
            List<Integer> pair = new ArrayList<>(); 
            // 2 values (element & frequency) pettadaaniki empty list
            pair.add(key); 
            // aa list lo elements add chesthadi
            pair.add(freq); 
            // followed by frequencies add chesthadi
            result.add(pair); 
            // final list lo add chesthadi
        }
        return result;
    }
    public static void main(String[] args) {
        CountFreq c = new CountFreq();
        int a [] = {5,5,5,5};
        System.out.println(c.countFrequencies(a));
    }
}

