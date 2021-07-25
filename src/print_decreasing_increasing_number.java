import java.util.Scanner;

public class print_decreasing_increasing_number {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            increasing_decreasing_number(n);
            s.close();        
        }
    
        public static void increasing_decreasing_number(int n) {
            if (n == 0){
                return ;
            }
            System.out.println("Decreasing Number: " + n); //print number decreasing
            increasing_decreasing_number(n-1);
            System.out.println("Increasing Number: " + n); // print number increasing
        }
}
