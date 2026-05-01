public class One2N {
    void Print(int i, int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        Print(i+1, n);
    }
    public static void main(String[] args) {
        One2N n = new One2N();
        n.Print(1, 5);
    }
}
