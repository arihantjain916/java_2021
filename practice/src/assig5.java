// Write a bank class which will throw custom exception 
// if customer tries to withdraw amount having minimum balance i.e.  Rs.500
import java.util.Scanner;
public class assig5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the withdrawl amount: ");
        int withdrawl = sc.nextInt();
        try{
            if(withdrawl > 500){
                System.out.println("Transaction Complete");
            }
            else{
                // throw new RuntimeException("Withdrawl amount must be greater than 500");
            }
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        sc.close();
    }
}
