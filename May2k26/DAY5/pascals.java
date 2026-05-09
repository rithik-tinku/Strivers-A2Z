import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pascals {
    public List<Integer> generatedRows(int rows){
        int ans =1;
        List<Integer> ansRow = new ArrayList<>();
        ansRow.add(1);
        for(int col =1; col<rows; col++){
            ans = ans*(rows-col);
            ans = ans/col;
            ansRow.add(ans);
        }
        return ansRow;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1; i<=numRows; i++){
            ans.add(generatedRows(i));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();
        pascals obj = new pascals();
        System.out.println(obj.generate(numRows));
        sc.close();
        
    }
}
