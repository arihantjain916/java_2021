public class try_exp{
    public static void main(String[] args) {
        try{
            float c = 1/0;
            System.out.println(c);
        }
        catch(Exception s){
            System.out.println(s);
        }
    }
}