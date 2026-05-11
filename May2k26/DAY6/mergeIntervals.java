import java.util.Arrays;
import java.util.Scanner;

public class mergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->Integer.compare(a[0], b[0]) );
        int start =0;
        for(int i=0; i<intervals.length; i++){
            if(start==0 || intervals[i][0]>intervals[start-1][1]){
                intervals[start] = intervals[i];
                start++;
            }
            else{
                intervals[start-1][1]=Math.max(intervals[start-1][1],intervals[i][1]);
            }
        }
        return Arrays.copyOfRange(intervals,0,start);
    }   
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] intervals = new int[n][2];
        for (int i = 0; i < n; i++) {
            intervals[i][0] = sc.nextInt();
            intervals[i][1] = sc.nextInt();
        }
        mergeIntervals obj = new mergeIntervals();
        int[][] ans = obj.merge(intervals);
        for (int i = 0; i < ans.length; i++) {
            System.out.print("["+ans[i][0] + "," + ans[i][1] + "]");
        }
        sc.close();
    }
}
