import java.io.*;
// import java.util.*;

public class find_the_index_of_occurence {
    // public static void main(String[] args) {
    // int a[] = { 1, 2, 3, 4, 5, 4, 8 };
    // int i = 0;
    // int d = 4;
    // int index = index_of_occ(a, i, d);
    // System.out.println("Index of occurence is " + index);
    // }

    // to print index from starting

    // public static int index_of_occ(int[] a , int index , int d) {
    // if(a.length == index){
    // return -1;
    // }
    // if(d == a[index]){
    // return index;
    // }
    // else{
    // int b = index_of_occ(a, index + 1 , d);
    // return b;
    // }
    // }

    // To print index from last
    // public static int index_of_occ(int[] a, int index, int d) {
    // if (a.length == index) {
    // return -1;
    // }
    // int b = index_of_occ(a, index + 1, d);
    // if(b == -1){
    // if (d == a[index]) {
    // return index;
    // } else {
    // return -1;
    // }
    // }
    // else{
    // return b;
    // }
    // }

    // to print all the occurence of the given value in array
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter the size of an array: ");
            int n = Integer.parseInt(br.readLine());

            int[] arr = new int[n];
            System.out.println("Enter the values of the array");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            System.out.println("Enter the number you want to take the occurence: ");
            int x = Integer.parseInt(br.readLine());

            int[] iarr = index_of_occ(arr, x, 0, 0);
            if (iarr.length == 0) {
                System.out.println();
                return;
            }

            System.out.println("The index of occurence of the number " + x + " is ");
            for (int i = 0; i < iarr.length; i++) {
                System.out.println(iarr[i]);
            }
        } catch (Exception e) {
            System.out.println("Some Error Occured");
        }
    }

    public static int[] index_of_occ(int[] arr, int x, int idx, int fsf) {
        if (idx == arr.length) {
            return new int[fsf];
        }

        if (x == arr[idx]) {
            int[] iarr = index_of_occ(arr, x, idx + 1, fsf + 1);
            iarr[fsf] = idx;
            return iarr;
        } else {
            int[] iarr = index_of_occ(arr, x, idx + 1, fsf);
            return iarr;
        }
    }
}
