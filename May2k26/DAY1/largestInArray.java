import java.util.*;
class largestInArray {
    public static int largest(int[] arr) {
        int large = arr[0];
        for(int i=1; i<arr.length; i++){
           if(large<arr[i]){
               large = arr[i];
           }
        }
        return large;
    } 
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int [n];
    for(int i=0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    int result = largest(arr);
    System.out.println(result);
    sc.close();
}
}