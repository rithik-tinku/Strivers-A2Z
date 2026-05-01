package Practice;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<>();
        nums.add(45);
        nums.add(135);
        nums.add(61);
        nums.add(401);
        Iterator<Integer> values = nums.iterator();
        while (values.hasNext()) {
            System.out.println(values.next());
        }

        
        //Sorted set == Treeset:
        // Set<Integer> nums = new TreeSet<>();
        // nums.add(45);
        // nums.add(135);
        // nums.add(61);
        // nums.add(401);
        // System.out.println(nums);
        // for (Integer integer : nums) {
        //     System.out.println(integer);
        // }

    }
}
