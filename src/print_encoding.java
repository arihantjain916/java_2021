public class print_encoding {
    public static void main(String[] args) {
        encoding("123", "");
    }

    public static void encoding(String a , String b) {
        if(a.length() == 0){
            System.out.println(b);
            return;
        }
        else if(a.length() == 1){
            char ch = a.charAt(0);
            if(ch == '0'){
                return;
            }
            else{
                int chv = ch - '0';
                char code = (char)('a' + chv - 1);
                System.out.println(b + code);
            }
        }
        else{
            char ch = a.charAt(0);
            String ans = a.substring(1);
            if(ch == '0'){
                return;
            }
            else{
                int chv = ch - '0';
                char code = (char)('a' + chv - 1);
                encoding(ans, b + code);
            }
            String ch1 = a.substring(0 , 2);
            String ans1 = a.substring(2);
            int ch1i = Integer.parseInt(ch1);
            if(ch1i <= 26){
                char code = (char)('a' + ch1i - 1);
                encoding(ans1, b + code);
            }
        }
    }
}
