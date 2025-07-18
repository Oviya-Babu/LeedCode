public class MatrixDiagonalSum{
    public static void main(String[] args) {
        int[][] mat = {
            { 1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int res = diagonalSum(mat);
        System.out.println(res);
        
    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
               if(i == j || i + j == mat.length - 1){
                  sum += mat[i][j];
               }
            }
        }
        return sum;     
    }
}