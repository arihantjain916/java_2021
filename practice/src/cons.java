class constr{
    int roll;
    int id;
    constr(int roll,int id) { 
        this.roll = roll;
        this.id = id;
    }
    void print(){
        System.out.println(id+" "+roll);
    }
}

public class cons {
    public static void main(String[] args) {
        constr c = new constr(50,10);
        c.print();
    }
}