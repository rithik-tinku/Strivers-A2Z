import java.util.Scanner;

public class rotateArray {
    public static void rotate(int[] arr) {
        int temp = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        rotate(arr);

        for(int i = 0; i < arr.length; i++){
        System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
