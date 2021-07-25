public class find_max_of_array {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5 };
        int i = 0;
        int max = max_array(a, i);
        System.out.println(max);
    }

    public static int max_array(int[] a, int index) {
        if (a.length -1 == index) {
            return a[index];
        }
        int max = max_array(a, index + 1);
        if (max > a[index]) {
            return max;
        } else {
            return a[index];
        }
    }
}