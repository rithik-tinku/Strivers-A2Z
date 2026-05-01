//brute force
import java.util.Arrays; // idhi enduku ante kndha chudu

class Divisors {
    public int[] divisors(int n) {
        int count = 0;
        int index = 0;

        // Step 1: count divisors
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                count++;
            }
        }

        // Step 2: create array
        int[] arr = new int[count];

        // Step 3: store divisors in array
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                arr[index] = i;
                index++;
            }
        }

        // Step 4: return whole array
        return arr;
    }

    public static void main(String[] args) {
        Divisors div = new Divisors();
        int[] result = div.divisors(8);

        // Print array
        for(int num : result) {
            System.out.print(num + " ");
        }
        // Print array
        // System.out.println(Arrays.toString(div.divisors(6))); 
    }
}
