import java.util.Scanner;

public class multi_array{
    public static void main(String[] args) {
        int arr[][] = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in array: ");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        // Extract value of array using for loop
        // for(int i=0;i<2;i++){
        //     for(int j=0;j<2;j++){
        //         System.out.println(arr[i][j]);
        //     }
        // }

        // Extract value of array using foreach loop
        for(int r[]:arr){
            for(int c : r){
                System.out.println("Values in array is: ");
                System.out.println(c);
            }
        }
        sc.close();
    }
}