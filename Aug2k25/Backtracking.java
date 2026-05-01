// different from One2N
public class Backtracking {
    void Print(int n){
        if(n==0) {
            return;
        }
        // System.out.println(n);// 5 4 3 2 1
        Print(n-1);
        System.out.println(n);// 1 2 3 4 5 
    }
    public static void main(String[] args) {
        Backtracking n = new Backtracking();
        n.Print(5);
    }
}