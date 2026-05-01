//time exceeded solution (chatgpt)
import java.util.Arrays; // idhi enduku ante kindha chudu

class Divisors1 {
    public int[] divisors(int n) {
        int count = 0;
        int temp[] = new int[2*(int)Math.sqrt(n)];

        // Step 1: count divisors & store divisors with max possibilities (n)
        for (int i = 1; i * i <= n; i++) {  // i<=Math.sqrt(n) kuda cheyochu
        // <-- √n check example: if n = 25, 6*6 =36>25 - loop stops 
            if (n % i == 0) {
                temp[count++] = i;          // small divisor
                if (i != n / i) {           // avoid duplicate for perfect square
                    temp[count++] = n / i;  // large divisor (pair)
                }
            }
        }

        Arrays.sort(temp,0,count);// which array, fromindex, last index
    
        /* 
        // Manual bubble sort on filled part only
        for (int i = 0; i < count - 1; i++) {// Outer loop runs from start to second last element
            for (int j = 0; j < count - i - 1; j++) {// Inner loop compares adjacent elements up to the unsorted part
                if (temp[j] > temp[j + 1]) {// If current element is greater than next, swap them
                    int t = temp[j];// store current element temporarily
                    temp[j] = temp[j + 1];// move next element to current position
                    temp[j + 1] = t;// put stored element in next position (swap)
                }
            }
        }
        */

        // Step 2: create array
        int[] arr = new int[count];

        // Step 3: store divisors in array without extras
        for(int i = 0; i <count; i++) {
                arr[i] = temp[i];
        }

        // Step 4: return whole array
        return arr;
    }

    public static void main(String[] args) {
        Divisors1 div = new Divisors1();
        // Print array
        for(int num : div.divisors(1000000000)) {
            System.out.print(num + " ");
        }
        // Print array
        // System.out.println(Arrays.toString(div.divisors(6))); 
    }
}
