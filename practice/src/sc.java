class Marks {
    private int phy, chem;
    public void inputM() {
        phy = Integer.parseInt(System.console().readLine("Enter physics marks"));
        chem = Integer.parseInt(System.console().readLine("Enter chemistry marks"));
    }
    public void dispM() {
        System.out.println(phy+" "+chem);
    }
    public Marks() {
        System.out.println("Marks Default");
    }
    public Marks(int p) {
        phy = p;
    }
    public Marks(int p, int c) {
        phy = p;
        chem = c; 
    }
}

class Student extends Marks {
    private int roll;
    private String name;
    public void inputS() {
    roll = Integer.parseInt(System.console().readLine("Enter roll"));
    name = System.console().readLine(); super.inputM();
    }
    public void dispS() {
        System.out.println(roll+ " "+ name); super.dispM();
        }

    public Student() {
        System.out.println("Student Default");
    }
    public Student(int r) {
        roll = r;
    }
    public Student(int r, String n) {
        roll = r;
        name = n;
    }
    public Student(int r, String n, int p, int c) {
        super(p, c);
        roll = r;
        name = n;
    }
}

public class sc{
    public static void main(String[] args) {
        Student s = new Student();
        s.hashCode();
    }
}
