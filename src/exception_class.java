import java.util.Scanner;

// class exception extends Exception{
//     @Override
//     public String toString() {
//         return "I am tostring";
//     }
//     @Override
//     public String getMessage() {
//         return "i am get message";
//     }
// }

// To make our own customize exception

// public class exception_class {
//     public static void main(String[] args) {
//         int a;
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         a = s.nextInt();
        
//         if(a%2 == 0){
//             try{
//                 // throw new exception();
//                 throw new ArithmeticException("Error!"); // we can also access prebuilt class for throwing exception
//             }
//             catch (Exception e){
//                 System.out.println(e.getMessage());
//                 System.out.println(e.toString());
//             }
//         }
//          s.close();
//     }
// }

public class exception_class {
    public static float divide (int a , int b) throws ArithmeticException{
        float result = a/b;
        return result;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = s.nextInt();
        System.out.print("Enter the second number: ");
        int b = s.nextInt();
        try{
            float c = divide(a , b);
            System.out.println(c);
        }
        catch(Exception e){
            System.out.println("Error");
        }
        finally{
            System.out.println("Finally Block");
        }
        s.close();
    }
}


