public class print_the_possible_number_present_in_keypad {
    public static void main(String[] args) {
        keypad("12", " ");
    }

    public static void keypad(String s , String ans)
    {
        String number[] = {"", "./", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (s.length() == 0)
        {
            System.out.println(ans);
            return;
        }

        char ch = s.charAt(0);
        String code = number[ch - '0']; //ch-'0' is used to convert character value to integer value.
        String a = s.substring(1);

        for (int i = 0; i < code.length(); i++)
        {
            keypad(a , ans + code.charAt(i));
        }
    }
}
