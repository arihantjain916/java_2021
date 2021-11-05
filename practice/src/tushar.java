class rectangle{
    int length;
    int breath;
    rectangle(int a, int b){
        this.length = a;
        this.breath = b;
    }
    void area(){
        int area = length * breath;
        System.out.println("Area of "+ length + " and "+ breath + " is " + area);
    }
    void perimeter(){
        int peri = 2*(length+breath);
        System.out.println("Perimeter of "+ length + " and "+ breath + " is " + peri);
    }
}

class square extends rectangle{
    
    int side;
    square(int a){
        super(a,a);
        this.side = a;
    }
    void area(){
        int area = side * side;
        System.out.println("Area of square having side "+ length+ " is " + area);
    }

    void perimeter(){
        int peri = 4*side;
        System.out.println("Perimeter of square having side "+ side +" is " + peri);
    }
}


public class tushar {
    public static void main(String[] args) {
        rectangle r = new rectangle(5,5);
        square s = new square(5);
        r.area(); 
        r.perimeter();
        s.area();
        s.perimeter();
    }
}