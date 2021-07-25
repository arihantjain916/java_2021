public class find_the_index_of_occurence {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 4, 8 };
        int i = 0;
        int d = 4;
        int e = 0;
        int index = index_of_occ(a, i, d , e);
        System.out.println("Index of occurence is " + index);
    }

    public static int index_of_occ(int[] a, int index, int d, int e) {
        if (a.length == index) {
            return -1;
        }
        if (index == a[index]) {
            index_of_occ(a, index + 1, d , e+1);
            return index;
        } else {
            return 0;
        }
    }
}
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
