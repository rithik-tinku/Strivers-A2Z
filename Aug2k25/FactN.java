public class FactN {
    static int fact =1;
    void Print(int n){
        if(n==0){
            System.out.println(fact);
            return;
        }
        fact = fact*n;
        Print(n-1);
    }
    public static void main(String[] args) {
        FactN n = new FactN();
        n.Print(4);
    }
}
