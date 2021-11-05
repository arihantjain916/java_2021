// Write a class to explain the concept of Encapsulation.

class student{  
    private String name;
    public void setname(String name){
        this.name = name;
    } 
    String get_name(){
        return name;
    }
}
public class ass3{
    public static void main(String[] args) {
        student sc = new student();
        sc.setname("Shashank");   
        System.out.println(sc.get_name());
    }
}