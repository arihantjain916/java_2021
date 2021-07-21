public class try_and_catch {
    public static void main(String[] args) {
        String [] name = {"Arihant" , "Akshat" , "Vanshika" , "Pihu"};
            try{
            System.out.println(name[4]);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
