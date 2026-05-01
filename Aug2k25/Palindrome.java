class Palindrome {
    public boolean isPalindrome(int n) {
        int temp = n;
        int reversed = 0;
        while (temp != 0) { // same as reverse number logic
            int digit = temp % 10;
            temp = temp/10;
            reversed = reversed * 10 + digit;
            if(reversed<0){ // negative number check
                return false;
            }
        }
        if(n == reversed){
        return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        System.out.println(p.isPalindrome(-121));
    }
}