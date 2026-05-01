//Unordered Map
package Strivers;

import java.util.*;

public class Unordered_map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take array input
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Step 2: Count frequency of each element using HashMap
        Map<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = arr[i];
            if (mpp.containsKey(key)) {
                // If key already exists, increase its count
                mpp.put(key, mpp.get(key) + 1);
            } else {
                // If key does not exist, add it with count 1
                mpp.put(key, 1);
            }
        }

        /* 
        // Iterate

        for (Map.Entry<Integer, Integer> entry : mpp.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        */

        // Step 3: Answer queries
        int q = sc.nextInt();
        while (q > 0) {
            int number = sc.nextInt();
            if (mpp.containsKey(number)) {
                System.out.println(mpp.get(number));
            } else {
                System.out.println(0); // If number not found
            }
            q--;
        }

        sc.close();
    }
}

