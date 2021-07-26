import java.util.ArrayList;

public class get_stair_path {
    public static void main(String[] args) {
        ArrayList <String> ans = stair_path(4);
        System.out.println(ans);
    }

    public static ArrayList<String> stair_path(int n) {
        if(n == 0){
            ArrayList <String> a = new ArrayList<>();
            a.add(" ");
            return a;
        }
        else if(n < 0){
            ArrayList <String> a = new ArrayList<>();
            return a;
        }
        //  Here rule is we can only jump either 1 or 2 or 3 stairs only in downward direction.

        ArrayList<String> path1 = stair_path(n - 1); // Recursive Call 1
        ArrayList<String> path2 = stair_path(n - 2); // Recursive Call 2
        ArrayList<String> path3 = stair_path(n - 3); // Recursive Call 3
        ArrayList<String> paths = new ArrayList<>();

        for(String path : path1){
            paths.add(path + 1);
        }

        for(String path : path2){
            paths.add(path + 2);
        }
        
        for(String path : path3){
            paths.add(path + 3);
        }
        return paths;
    }
}
