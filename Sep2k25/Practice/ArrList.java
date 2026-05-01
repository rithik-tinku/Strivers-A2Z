package Practice;

import java.util.*;

public class ArrList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(6);
        nums.add(5);
        nums.add(2);
        System.out.println(nums);
        System.out.println(nums.get(2));
        System.out.println(nums.indexOf(2));
        // Collection nums = new ArrayList();
        // nums.add(5);
        // nums.add(6);
        // nums.add(5);
        // nums.add(2);
        // System.out.println(nums);
        // for (Object integer : nums) {
        //     int n = (int) integer;
        //     System.out.println(n*2);
        // }
    }
}
