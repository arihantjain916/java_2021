import java.util.ArrayList;

public class get_maze_path {
    public static void main(String[] args) {
        ArrayList<String> ans = maze_path(1, 1, 3, 3);
        System.out.println(ans);
    }

    public static ArrayList<String> maze_path(int sr, int sc, int er, int ec) {
        if (sr == er && sc == ec) {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        ArrayList<String> hpath = new ArrayList<>();
        ArrayList<String> vpath = new ArrayList<>();

        if (sc < ec) {
            hpath = maze_path(sr, sc + 1, er, ec);
        }

        if (sr < er) {
            vpath = maze_path(sr + 1, sc, er, ec);
        }

        ArrayList<String> paths = new ArrayList<>();

        for (String path : hpath) {
            paths.add("h" + path);
        }

        for (String path : vpath) {
            paths.add("v" + path);
        }
        return paths;
    }
}