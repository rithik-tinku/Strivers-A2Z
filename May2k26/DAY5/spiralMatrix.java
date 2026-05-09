import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class spiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int top =0;
        int left =0;
        int btm = row-1;
        int right = col-1;
        List<Integer> ans = new ArrayList<Integer>();
        while(top<=btm && left<=right){
            for(int i=left; i<=right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=btm; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top<=btm){
                for(int i=right; i>=left; i--){
                    ans.add(matrix[btm][i]);
                }
                btm--;
            }
            if(left<=right){
                for(int i=btm; i>=top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        spiralMatrix obj = new spiralMatrix();
        System.out.println(obj.spiralOrder(matrix));
        sc.close();
    }
}
