package Strivers;

public class N2one {
    void Print(int i, int n){
        if(i<1){
            return;
        }
        System.out.println(i);
        Print(i-1, n);
    }
    public static void main(String[] args) {
        N2one n = new N2one();
        n.Print(5,0);
    }
}
