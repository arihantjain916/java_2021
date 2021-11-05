class A{
    void a(){
        System.out.println("Method of class A");
    }
}
class B extends A{
    void b(){
        System.out.println("Method of class B");
    }
}
class C extends A{
    void c(){
        System.out.println("Method of class C");
    }
}

public class heir {
    public static void main(String[] args) {
        C c = new C();
        c.a();
        c.c();
    }
}
