// Program Demonstrating ploymorphism by method overloading and overridding.

class Samsung{
    void ring(){
        System.out.println("Phone rings....");
    }
    void charger(String type){
        System.out.println("Charger type is: "+type);
    }
}

class A21 extends Samsung{
    void ring(){
        System.out.println("Samsung A21 rings");
    }
    void charger(String type , int number){
        System.out.println("Charger type is: "+ type+ " and plug "+ number+" chargers");
    }
}
public class assig {
    public static void main(String[] args) {
        A21 a = new A21(); // Overridding
        a.ring();
        a.charger("3 Pin"); //Overloading
        a.charger("3 Pin", 5); //Overloading
    }
}