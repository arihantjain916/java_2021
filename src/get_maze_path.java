import java.util.ArrayList;

public class get_maze_path {
    // Main Class is for both Case 1 and Case 2
    public static void main(String[] args) {
        // For case 1
        // ArrayList<String> ans = maze_path(1, 1, 3, 3);
        // System.out.println(ans);

        // For case 2
        ArrayList<String> ans = get_maze(1, 1, 4, 4);
        System.out.println(ans);
    }

    //                              ---> CASE: 1 <---
    // here we can only move either horizontal or vertical
    // public static ArrayList<String> maze_path(int sr, int sc, int er, int ec) {
    // if (sr == er && sc == ec) {
    // ArrayList<String> ans = new ArrayList<>();
    // ans.add("");
    // return ans;
    // }

    // ArrayList<String> hpath = new ArrayList<>();
    // ArrayList<String> vpath = new ArrayList<>();

    // if (sc < ec) {
    // hpath = maze_path(sr, sc + 1, er, ec);
    // }

    // if (sr < er) {
    // vpath = maze_path(sr + 1, sc, er, ec);
    // }

    // ArrayList<String> paths = new ArrayList<>();

    // for (String path : hpath) {
    // paths.add("h" + path);
    // }

    // for (String path : vpath) {
    // paths.add("v" + path);
    // }
    // return paths;
    // }

    //                               ---> CASE: 2 <---
    // Here jump allowed we can directly approach to the destination or by moving
    // horizontally or vertically

    public static ArrayList<String> get_maze(int sr, int sc, int er, int ec) {

        ArrayList<String> path = new ArrayList<>();
        if (sr == er && sc == ec) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        // Horizontal Move
        for(int h = 1; h < ec - sc; h++){
            ArrayList <String> hpath = get_maze(sr, sc + h, er, ec);
            for(String hpaths : hpath){
                path.add("h" + h + hpaths);
            }
        }

        // Vertical Move
        for(int v = 1; v<= er - sr; v++){
            ArrayList<String> vpath = get_maze(sr + v, sc , er, ec);
            for(String vpaths : vpath){
                path.add("v" + v + vpaths);
            }
        }

        // Diagonal Move 
        for(int d = 1; d <= er - sr && d <= ec - sc; d++){
            ArrayList<String> dpath = get_maze(sr + d, sc + d, er, ec);
            for(String dpaths : dpath){
                path.add("d" + d + dpaths);
            }
        }
        return path;
    }
}
