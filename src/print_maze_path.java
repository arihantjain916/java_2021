public class print_maze_path {
    public static void main(String[] args) {
        // For Case 1
        // maze_path(0, 0, 3, 3, "");

        // For Case 2
        maze_path_jump(0 , 0 , 3 , 3 , "");
    }

    //                     CASE 1 NO JUMP ALLOWED
    // public static void maze_path(int sr , int sc , int er , int ec , String a) {
    //     if((sr > er) || (sc > ec)){
    //         return;
    //     }

    //     if(sr == er && sc == ec){
    //         System.out.println(a);
    //         return;
    //     }
    //     maze_path(sr, sc + 1, er, ec, a + "h");
    //     maze_path(sr + 1, sc, er, ec, a + "v");
    // }

    //                     CASE 2 JUMP ALLOWED
    public static void maze_path_jump(int sr , int sc , int er , int ec , String a) {
        if(sr == er && sc == ec){
            System.out.println(a);
            return;
        }

        // Horizontal Move
        for(int h = 1; h < ec - sc; h++){
            maze_path_jump(sr, sc + h, er, ec , a + "h");
        }

        // Vertical Move
        for(int v = 1; v<= er - sr; v++){
            maze_path_jump(sr + v, sc, er, ec, a + "v");
        }
    }
}
