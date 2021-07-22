import java.util.Scanner;

public class recursion {
    public static int factorial(int n) {
        if(n==0 || n == 1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.print("Enter the number: ");
            int a = s.nextInt();
            int b = factorial(a);
            System.out.println(b);
            s.close();
        }
        catch (Exception e){
            System.out.println("Error! Please enter only Integer ");
        }
    }
}
