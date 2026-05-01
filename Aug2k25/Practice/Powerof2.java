//Recursion
package Practice;

public class Powerof2 {
    public boolean isPowerOfTwo(int n) {
        if(n<1){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n%3!=0){
            return false;
        }
        return isPowerOfTwo(n/3);
    }
    public static void main(String[] args) {
        Powerof2 p = new Powerof2();
        System.out.println(p.isPowerOfTwo(-1));
    }
}
