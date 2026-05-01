package Strivers;

import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input string
        String s = sc.next();

        // Step 2: Create frequency array for 'a' to 'z'
        int[] hash = new int[26]; // automatically initialized to 0

        // Step 3: Count frequency of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';      // convert character to index (0 to 25)
            hash[index] = hash[index] + 1; // increase count
        }

        // Step 4: Process queries
        int q = sc.nextInt();
        while (q > 0) {
            char c = sc.next().charAt(0);
            int index = c - 'a';
            System.out.println(hash[index]);
            q--; // decrease query count
        }

        sc.close();
    }
}


