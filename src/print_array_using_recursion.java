public class print_array_using_recursion {
    public static void main(String[] args) {
        int a[] = {1 , 2 , 3 , 4 , 5};
        int i = 0;
        array(a , i);
    }

    public static void array(int[] a , int index) {
        if(a.length == index){
           return;
        }
        System.out.println(a[index]);
        array(a, index + 1);
    }
}
