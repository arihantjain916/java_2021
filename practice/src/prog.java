class comp{
    int salary = 1000;
}

class emplo extends comp{
    int bonus=500;
}

public class prog {
    public static void main(String[] args) {
        emplo e = new emplo();
        System.out.println(e.salary);
        System.out.println(e.bonus);
    }
}
