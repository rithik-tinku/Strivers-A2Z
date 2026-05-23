import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class missingAndRepeating {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int r = -1;
        int m = -1;
        HashSet<Integer> set = new HashSet<>();
        //repeating
        for(int num : arr){
            if(set.contains(num)){
                r = num;
            }
            else{
                set.add(num);
            }
        }
        //missing
        for(int i=1; i<=arr.length; i++){
            if(!set.contains(i)){
                m=i;
                break;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(r);
        ans.add(m);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        missingAndRepeating obj = new missingAndRepeating();
        ArrayList<Integer> ans = obj.findTwoElement(arr);
        System.out.println(ans.get(0) + " " + ans.get(1));
        sc.close();
    }
}
