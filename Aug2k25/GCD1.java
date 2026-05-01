//exceeded timelimit solution (chatgpt)
class GCD1 {
    public int GCD(int n1, int n2) {
        int n3 = n1;
        int n4 = n2;
        while(n4!=0){
           int temp = n3%n4;// 6 // 12%6 = 0
            n3 = n4; // 12 // 6
            n4 = temp; // 6 // 0
        }
        return n3; // 6
    }
    public static void main(String[] args) {
        GCD1 gcd = new GCD1();
        System.out.println(gcd.GCD(6, 12));
    }
}