package Practice;
import java.util.*;
public class hashMap {
    public static void main(String[] args) {
        Map<String,Integer> nums = new HashMap <>();
        nums.put("Noresh", 55);
        nums.put("Petesh",65);
        nums.put("Yamuth", 15);
        nums.put("Olliesh", 05);
        nums.put("Petesh", 45);
        System.out.println(nums);
        System.out.println(nums.get("Yamuth"));
        System.out.println(nums.keySet());
        System.out.println(nums.values());
    }
}
