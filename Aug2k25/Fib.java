//Fibonacci
class Fib {
    public int Print(int n) {
        if(n<=1){
            return n;
        }
        return Print(n-1)+Print(n-2);
    }
    public static void main(String[] args) {
        Fib f = new Fib();
        System.out.println(f.Print(45));
    }
}

/*
Time exceeded ki solution

class Fib {
    int[] dp = new int[50]; // enough for n=45

    public int Print(int n) {
        if(n <= 1){
            return n; // base cases
        }
        if(dp[n] != 0){
            return dp[n]; // already computed
        }
        dp[n] = Print(n-1) + Print(n-2); // store result
        return dp[n];
    }

    public static void main(String[] args) {
        Fib f = new Fib();
        System.out.println(f.Print(45)); // 1134903170
    }
}
*/
