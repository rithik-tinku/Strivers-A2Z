package Strivers;
import java.util.*;
class Divisors {
    public  int[] printDivisors(int n) {
        List<Integer> ls = new ArrayList<>();//ArrayList (a type of List) grows size automatically as you add elements

        for (int i = 1; i * i <= n; i++) {// idhi ardham kaatle ante vere divisors codes chudu
            if (n % i == 0) {
                ls.add(i);//Lists provide handy methods like add(), sort(), size() and easy iteration.
                if (i != n / i) {
                    ls.add(n / i);
                }
            }
        }
// a standard way to handle groups of objectes gathered together like lists, sets, queues, etc.
        Collections.sort(ls);
        int[] res = new int[ls.size()];
        for (int i = 0; i < ls.size(); i++) {
            res[i] = ls.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Divisors div = new Divisors();
        int result[] = div.printDivisors(100);
            for (int d : result) {
            System.out.print(d + " ");
        }
    }
}
