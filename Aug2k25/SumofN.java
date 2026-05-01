public class SumofN {
    int Print(int n, int sum){
        if(n==0){
            return sum;
        }
        return Print(n-1,sum+n);
    }
    public static void main(String[] args) {
        SumofN n = new SumofN();
        int a = n.Print(4,0);
        System.out.println(a);
    }
}
