//palindrome
class RecursPal {   
    public boolean Print(int i, String s) {
        int l = s.length();
        if(i>=l/2){
            return true;
        }
        if(s.charAt(i)!=s.charAt(l-i-1)){
            return false;
        }
        return Print(i+1, s);
    }
    public static void main(String[] args) {
        RecursPal p = new RecursPal();
        System.out.println(p.Print(0,"madam"));
    }
}