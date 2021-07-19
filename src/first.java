public class first{
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int a = 5;
        int b = 5;
        // format is used to print like this
        System.out.format("%d X %d = %d",a , b , a*b);
        System.out.println();
        // To find the data type of non primitive variable we use
        Integer i = 5;
        System.out.println(i.getClass().getSimpleName()); 
        // To find the data type of primitive variable we use
        int j = 5;
        System.out.println(((Object)j).getClass().getName()); 
    }
}
