public class Ntime{
    void Name(int i, int n){
        if(i>n){
            return;
        }
        System.out.println("Rithik");
        Name(i+1, n);
    }
public static void main(String args[]){
    Ntime n = new Ntime();
    n.Name(1,3);
}
}