// Write two classes implementing the concept of interfaces

interface Realme{
    void ring();
    void charger();
}

class Realme3 implements Realme{
    public void ring(){
        System.out.println("Realme 3 Rings....");
    }
    public void charger(){
        System.out.println("Realme 3 has Type C charger.");
    }
}
public class assig2 {
    public static void main(String[] args) {
        Realme3 r = new Realme3();
        r.ring();
        r.charger();
    }
}