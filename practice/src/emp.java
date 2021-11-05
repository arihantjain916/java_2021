class empl{
    String name;
    int id;
    float tax;
    int salary;

    public void showdata(){
        System.out.println(name+" "+id+" "+salary+" "+tax);
    }
}

public class emp {
    public static void main(String[] args) {
        empl e1 = new empl();
        e1.id = 5;
        e1.name = "Arihant";
        e1.salary = 10000000;
        e1.tax = 5.0f;

        e1.showdata();
    }
}
