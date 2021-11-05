class animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class dog extends animal{
    void bark(){
        System.out.println("Barking...");
    }
}
class cat extends dog{
    void walk(){
        System.out.println("Walking...");
    }
}


public class mi {
    public static void main(String[] args) {
        cat c = new cat();
        c.eat();
        c.bark();
        c.walk();
    }
}
