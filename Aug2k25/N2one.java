public class N2one {
    void Print(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(n);
        Print(i, n-1);
    }
    public static void main(String[] args) {
        N2one n = new N2one();
        n.Print(1, 5);
    }
}
