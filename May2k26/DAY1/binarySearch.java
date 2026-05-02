import java.util.*;

public class binarySearch {
    public static boolean binSearch(List<Integer> arr, int k) {
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i) == k){
                return true;
            }
        }
        return false;
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }
        int k = sc.nextInt();
        boolean result = binSearch(arr, k);
        System.out.println(result);

        sc.close();

    }
}
