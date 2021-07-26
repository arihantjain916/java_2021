public class print_substr_of_a_string {
    public static void main(String[] args) {
        substring("ABC" , "");
        System.out.println();
    }
public static void substring(String s , String ans) {
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(0);
        String a = s.substring(1);
    
        substring(a , ans);
        substring(a , ans + ch);
    }
}
