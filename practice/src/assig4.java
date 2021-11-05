// Write an Exception class which divides a number from another and throws exception if denominator is 0. 
// (Two number can be taken as user input)
import java.util.Scanner;
public class assig4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        int c;
        try{
            c = a/b;
            System.out.println("The result of division is "+c);
        }
        catch(Exception e){
            System.out.println(e);
        }
        sc.close();
    }
}
