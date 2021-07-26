import java.util.Scanner;

public class flood_fill {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();

        int[][] arr = new int[n][m];

        System.err.println("enter the number");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        boolean[][] visited = new boolean[n][m];
        floodfill(arr, 0, 0, "", visited);
        s.close();
    }

    public static void floodfill(int[][] arr, int row, int col, String ans, boolean[][] visited) {
        if (row == arr.length || col == arr[0].length || row < 0 || col < 0 || visited[row][col] == true
                || arr[row][col] == 1) {
            return;
        }

        if (row == arr.length - 1 && col == arr[0].length - 1) {
            System.out.println(ans);
            return;
        }
        visited[row][col] = true;
        floodfill(arr, row - 1, col, ans + "t", visited);
        floodfill(arr, row, col - 1, ans + "l", visited);
        floodfill(arr, row + 1, col, ans + "d", visited);
        floodfill(arr, row, col + 1, ans + "r", visited);
        visited[row][col] = false;
    }
}
