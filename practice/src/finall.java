abstract class l {
    public void func1() {
        System.out.println("Hi");
    }
}
class m extends l {
    public void func() {
        System.out.println("Hi X 2");
    }
}

public class finall {
    public static void main(String[] args) {
        // final int i=5;
        // // i++;
        // System.out.println(i);
        m M = new m();
        M.func();
        M.func1();
    }
}
