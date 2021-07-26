public class print_stair_path {
    public static void main(String[] args) {
        stair_path(4, "");
    }

    public static void stair_path(int n , String a) {
        if(n == 0){
            System.out.println(a);
            return;
        }
        if(n < 0){
            return;
        }
        stair_path(n-1, a + "1");
        stair_path(n-2, a + "2");
        stair_path(n-3, a + "3");
    }
}
