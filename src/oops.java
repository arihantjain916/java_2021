// First Class
// class Employee{
//     int id;
//     String name;
//     int salary;
//     public void print_details() {
//         System.out.println("Id is " + id);
//         System.out.println("Name is " + name); 
//         System.out.println("Salary is " + salary); 
//     }
// }

// Second Class
// class cell_phone{
//     public void ringing() {
//         System.out.println("Ringing");
//     }
//     public void vibrating() {
//         System.out.println("Vibrating");
//     }

// }

// Third Class
// class square{
//     int side;
//     public void area() {
//         System.out.format("The Area of Square with side %d cm is %d cm^2" , side , side*side); 
//         System.out.println();
//     }
//     public void perimeter() {
//         System.out.format("The Perimeter of Square with side %d cm is %d cm" , side , 4*side);  
//         System.out.println();
//     }
// }

// Fourth Class
// class rectangle {
//     int length;
//     int width;

//     public void area() {
//         System.out.format("The Area of rectangle with length %d cm and width %d cm is %d cm^2", length, width,
//                 length * width);
//         System.out.println();
//     }

//     public void perimeter() {
//         System.out.format("The Perimeter of rectangle with length %d cm and width %d cm is %d cm", length, width,
//                 2 * (length + width));
//         System.out.println();
//     }
// }

// Fourth Class
class circle {
    double radius;

    public void area() {
        double areaa = (22 * radius * radius) / 7;
        System.out.format("The Area of circle with radius %.2f cm is %.2f cm^2", radius, areaa);
        System.out.println();
    }

    public void perimeter() {
        double peri = (22 * 2 * radius) / 7;
        System.out.format("The Perimeter of circle with radius %.2f cm is %.2f cm", radius, peri);
        System.out.println();
    }
}

// Main Class
public class oops {
    public static void main(String[] args) {
        // //Make new class object of class1
        // Employee employee1 = new Employee();
        // Employee employee2 = new Employee();

        // employee1.id = 101;
        // employee1.name = "Arihant Jain";
        // employee1.salary = 50;

        // employee2.id = 102;
        // employee2.name = "Akshat Jain";
        // employee2.salary = 54;

        // employee1.print_details();
        // System.out.println();
        // employee2.print_details();

        // Make new class object of class2
        // cell_phone cell = new cell_phone();
        // cell.ringing();
        // cell.vibrating();

        // Make new class object of class3
        // square a = new square();
        // a.side = 5;

        // a.area();
        // a.perimeter();

        // Make new class object of class3
        // rectangle a = new rectangle();
        // a.length = 5;
        // a.width = 4;

        // a.area();
        // a.perimeter();

        // Make new class object of class4
        circle a = new circle();
        a.radius = 14;

        a.area();
        a.perimeter();

    }
}
