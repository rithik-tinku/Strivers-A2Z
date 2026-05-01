class Armstrong {
    public boolean isArmstrong(int n) {
        int x =n;//153
        int sum =0;
        int count =0;
        while(x!=0){
            int rem = x%10;//3
            x = x/10;//15
            count++;// enni digits unnayi ani..
        }
        int y =n;// because x anedhi already 0 varak ochesindhi
        while(y!=0){
            int digit = y%10;//3
            y = y/10;//15
            sum = sum + (int)Math.pow(digit, count);//power of the number of digits
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Armstrong a = new Armstrong();
        System.out.println(a.isArmstrong(370));
    }
}