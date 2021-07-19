import java.util.Scanner;

public class conditional {
    public static void main(String[] args) { 
        /*
         * If we want to take input which include space then we have to use nextLine() function, 
         * or if we want to take input without including space then we have to use next() function.
         * If we want to take input as integer then we have to use nextInt() function,
         * Esse hi sare honge...
         */
        // Scanner a = new Scanner(System.in);
        // System.out.print("Enter the string: ");
        // String input = a.nextLine();
        // System.out.print("The output is ");
        // System.out.println(input);

        // System.out.print("Enter the float number: ");
        // float c = a.nextFloat();
        // System.out.print("The output is ");
        // System.out.println(c);

        // System.out.print("Enter the number: ");
        // int b = a.nextInt();
        // System.out.print("The output is ");
        // System.out.println(b);

        // if (b%2 == 0){
        //     System.out.println("Even Number");
        // }

        // else if (b/3 == 1){
        //     System.out.println(b + " divide by 2 gives " + b/2);
        // }
        // else{
        //     System.out.println("Odd Number");
        // }

        // Switch Statment
        // switch (b)
        // {
        //     case 12:
        //     System.out.println("age is 12");
        //     break;

        //     default:
        //     System.out.println("   l");
        // }

        // WAP TO PRINT DAY NAME USING THE NUMBER OF THAT DAY
        
        Scanner d = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int c = d.nextInt();

        switch (c){
            case 1:
            System.out.println("Sunday");
            break;

            case 2:
            System.out.println("Monday");
            break;

            case 3:
            System.out.println("Tuesday");
            break;

            case 4:
            System.out.println("Wednesday");
            break;

            case 5:
            System.out.println("Thursday");
            break;

            case 6:
            System.out.println("Friday");
            break;

            case 7:
            System.out.println("Saturday");
            break;

            default:
            System.out.println("Incorrect Input");
        }

        // a.close();
        d.close();
}
}