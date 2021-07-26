public class print_n_queen {
    public static void main(String[] args) {
        int n = 3;
        int[][] chess = new int[n][n];
        queen(chess , "" , 0);
    }

    public static void queen(int[][] chess , String ans , int row) {
        if(row == chess.length){
            System.out.println(ans);
            return;
        }

        for(int col = 0; col < chess.length ; col++){
            if(safe_for_queen(chess , row , col) == true){
                chess[row][col] = 1;
                queen(chess, ans + row + "-" + col + " ,", row + 1);
                chess[row][col] = 0;
            }
        }
    }

    public static boolean safe_for_queen(int[][] chess , int row , int col) {

        // For check horizontally
        for(int i = row - 1 , j = col; i >= 0; i--){
            if(chess[i][j] == 1){
                return false;
            }
        }

        // For check vertically
        for(int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++){
            if(chess[i][j] == 1){
                return false;
            }
        }
        // For check diagonally
        for(int i = row - 1 , j = col - 1; i >= 0 && j >= 0; i--, j--){
            if(chess[i][j] == 1){
                return false;
            }
        }
        return true;
    }
}
