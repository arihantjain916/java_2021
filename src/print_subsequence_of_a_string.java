import java.util.*;

public class print_subsequence_of_a_string {
    public static void main(String[] args) {
        ArrayList<String> a = get_subsequence("ABC");
        System.out.println(a);
    }

    public static ArrayList<String> get_subsequence(String a) {
        if(a.length() == 0){
            ArrayList<String> st = new ArrayList<>();
            st.add("");
            return st;
        }
        char ch = a.charAt(0);
        String ros = a.substring(1);
        ArrayList<String> res = get_subsequence(ros);

        ArrayList<String> myres = new ArrayList<>();

        for(String rstr : res){
            myres.add("" + rstr);
        }

        for(String rstr : res){
            myres.add(ch + rstr);
        }

        return myres;
    }
}
