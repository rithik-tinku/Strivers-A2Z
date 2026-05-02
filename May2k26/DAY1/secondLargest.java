import java.util.*;

class secondLargest {

    public static int getSecondLargest(int[] arr) {
        int first = arr[0];
        int second = -1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > first){
                first = arr[i];
            }
            else if(arr[i] > second && arr[i] != first){
                second = arr[i];
            }
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int result = getSecondLargest(arr);
        System.out.println(result);
        sc.close();
    }
}