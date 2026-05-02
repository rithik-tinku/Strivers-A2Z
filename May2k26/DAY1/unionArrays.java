import java.util.ArrayList;
import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Set;
import java.util.Scanner;

public class unionArrays {

    // public static ArrayList<Integer> union(int a[], int b[]) {

    //     Set<Integer> set = new HashSet<>();

    //     // add elements of a
    //     for(int i = 0; i < a.length; i++){
    //         set.add(a[i]);
    //     }

    //     // add elements of b
    //     for(int i = 0; i < b.length; i++){
    //         set.add(b[i]);
    //     }

    //     // convert set to list
    //     return new ArrayList<>(set);
    // }
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0 , j=0;
        ArrayList<Integer> result = new ArrayList<>();
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                if(result.size()==0 || result.get(result.size()-1)!=a[i]){
                    result.add(a[i]);
                }
                i++;
            }
            else if(a[i]>b[j]){
                if(result.size()==0 || result.get(result.size()-1)!=b[j]){
                    result.add(b[j]);
                }
                j++;
            }
            else{// a[i] == b[j]
                if(result.size()==0 || result.get(result.size()-1)!=a[i]){
                    result.add(a[i]);
                }
                i++;
                j++;
            }
        }
        while(i < a.length){
        if(result.size() == 0 || result.get(result.size()-1) != a[i]){
        result.add(a[i]);
        }
        i++;
        }
        while(j < b.length){
        if(result.size() == 0 || result.get(result.size()-1) != b[j]){
            result.add(b[j]);
        }
        j++;
        }
        return result;
    }
public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] a = new int[n1];

        for(int i = 0; i < n1; i++){
            a[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] b = new int[n2];

        for(int i = 0; i < n2; i++){
            b[i] = sc.nextInt();
        }

        ArrayList<Integer> result = findUnion(a, b);

        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i) + " ");
        }

        sc.close();
    }
}
