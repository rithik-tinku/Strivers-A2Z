public class findKthRotation {
    // same to same as findMinRotatedArray.java 
    // but instead of returning the minimum element 
    // we will return the index of minimum element which is also the number of rotations
    public int findKRotation(int arr[]) {
        int low =0; 
        int high =arr.length-1;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid]>arr[high]){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
}
