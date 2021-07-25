import java.util.Scanner;

public class print_increasing_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        increasing_number(n);
        s.close();    
    }

    public static void increasing_number(int n) {
        if (n == 0){
            return;
        }
        increasing_number(n-1);
        System.out.println(n);
    }
}
