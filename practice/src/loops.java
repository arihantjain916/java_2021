import java.util.Scanner;

public class loops{
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<10;i++){
            arr[i]=sc.nextInt();
        }

        sc.close();
    }
}

