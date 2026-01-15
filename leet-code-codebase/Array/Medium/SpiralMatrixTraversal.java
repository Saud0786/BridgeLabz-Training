import java.util.*;

public class SpiralMatrixTraversal {

    public static List<Integer> spiralOrder(int[][] mat) {
        // rows   
        int r = mat.length;
		// columns
        int c = mat[0].length;

        List<Integer> ans = new ArrayList<>();

        int top = 0, left = 0;
        int right = c - 1, bottom = r - 1;
        int total = 0;
              
		// codition for traversal	  
        while (total < r * c) {

            for (int j = left; j <= right && total < r * c; j++) {
                ans.add(mat[top][j]);
                total++;
            }
            top++;

            for (int i = top; i <= bottom && total < r * c; i++) {
                ans.add(mat[i][right]);
                total++;
            }
            right--;

            for (int j = right; j >= left && total < r * c; j--) {
                ans.add(mat[bottom][j]);
                total++;
            }
            bottom--;

            for (int i = bottom; i >= top && total < r * c; i--) {
                ans.add(mat[i][left]);
                total++;
            }
            left++;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int c = sc.nextInt();

        int[][] mat = new int[r][c];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        List<Integer> result = spiralOrder(mat);
		
        // print output   
        System.out.println("Spiral Order:");
        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
