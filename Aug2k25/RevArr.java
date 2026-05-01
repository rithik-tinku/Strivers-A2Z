public class RevArr {
    void Print(int i, int arr[], int n){
        if(i>=n/2){
            return;
        }
        int temp = arr[i];
        arr[i] = arr[n-i-1];
        arr[n-i-1] = temp;
        Print(i+1,arr, n);
    }
    public static void main(String[] args) {
        RevArr a = new RevArr();
        int[] arr = {1,2,3,4,5};
        a.Print(0, arr , arr.length);
        for(int x : arr){
            System.out.print(x);
        }
    }
}
