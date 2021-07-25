import java.util.Scanner;

public class print_power_using_recursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = power(a , b);
        System.out.println(c);
        s.close();
    }

    public static int power(int a , int b) {
        if(b == 0){
            return 1;
        }
        int power = power(a, b / 2);
        int ans = power * power;

        if(b % 2 != 0){
            ans = ans * a; 
        }
        return ans;
    }
}
