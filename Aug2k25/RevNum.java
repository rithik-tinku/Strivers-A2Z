import java.util.Scanner;
class RevNum {
    public int reverseNumber(int n) {
        int y=0;
        while(n!=0){
            int r = n%10; // last digit
            n =n/10; // remove last digit from number
            if(y>Integer.MAX_VALUE/10 || y<Integer.MIN_VALUE/10){ // int range check
                return 0;
            }
            y = y*10+r; // add last digit one by one
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RevNum rn = new RevNum();
        System.out.println(rn.reverseNumber(1534236469));
        sc.close();
    }
}