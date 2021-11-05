// Write a Java program to find the maximum occurring character in a string.

public class ass4 {
    public static void main(String[] args) {
        String str = "Shashank Jain";
        int arr[] = new int[256];
        int len = str.length();
        for(int i = 0; i<len; i++){
            arr[str.charAt(i)]++;
        }
        int max = -1;
        char result = ' ';
        for (int i = 0; i < len; i++) {
            if (max < arr[str.charAt(i)]) 
            {
                max = arr[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        System.out.println("Maximimum occurence character is: " + result);
    }
}