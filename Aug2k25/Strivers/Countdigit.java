package Strivers;
public class Countdigit {
    public static void main(String[] args) {
        int n = 7789;
        int count = (int)Math.log10(n)+1;// log10 (7789) = 3.89+1 = 4.89 ~ 4
        System.out.println(count);   
    }
}
