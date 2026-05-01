// yet not the besta approach
package Strivers;
public class GCD {
    public int gcd(int n1, int n2) {
        for(int i = Math.min(n1, n2); i > 1; i--) {
            if(n1%i==0 && n2%i==0) {
                return i;
            }
        }
        return 1; // if both n1 & n2 are same
    }
    public static void main(String[] args) {
        GCD gcd = new GCD();
        System.out.println(gcd.gcd(8, 12));
    }

}
