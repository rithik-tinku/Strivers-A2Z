class CountDigits {
    public int countDigit(int n) {
        int count = 0;
        if(n==0){ // zero anedhi kuda 1 digit
            return 1;
        }
        while(n!=0){ // zero ayyevarku
            int rem = n%10; // last digit teesestham
            n = n/10; // removed digit original number lo teeseyali
            count++; // enni sarlu digits deduct avthayi zero ayyevarku
        }
        return count;
    }
    public static void main(String[] args) {
        CountDigits cd = new CountDigits();
        System.out.println(cd.countDigit(0));
    }
}