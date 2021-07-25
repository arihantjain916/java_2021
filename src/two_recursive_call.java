import java.util.Scanner;

public class two_recursive_call {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        zigzag(a);
        s.close();
    }

    public static void zigzag(int a) {
        if(a == 0){
            return;
        }
        System.out.println("Pre " + a);
        zigzag(a-1);
        System.out.println("In " + a);
        zigzag(a-1);
        System.out.println("Post " + a);
    }
}
