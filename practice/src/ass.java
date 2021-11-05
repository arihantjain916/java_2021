import java.util.Scanner;

// Write a Java method to compute the sum of the digits in an integer.

public class ass {
    public static void main(String[] args) {
        int a, b, sum;
        System.out.println("Enter the values of A and B: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a+b;
        System.out.println("The sum of "+ a + " and " + b +" is " + sum);
        sc.close();
    }
}
