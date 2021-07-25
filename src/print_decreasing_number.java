import java.util.Scanner;

public class print_decreasing_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        decreasing_number(n);
        s.close();        
    }

    public static void decreasing_number(int n) {
        if (n == 0){
            return;
        }
        System.out.println(n);
        decreasing_number(n-1);

    }
}
