public class print_permutation {
    public static void main(String[] args) {
        permutation("abc", "");
    }

    public static void permutation(String a, String b) {
        if (a.length() == 0) {
            System.out.println(b);
            return;
        }

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            String c = a.substring(0, i);
            String d = a.substring(i + 1);
            String ans = c + d;
            permutation(ans, b + ch);
        }
    }
}
