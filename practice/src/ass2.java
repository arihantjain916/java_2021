// Write an Employee class having its attributes and behaviors, Write another class as
// Manager that should inherit all the common features from Employee Class thus
// making use of Reusability (Inheritance).

class Employee1{
    int salary = 1000;
    void salary(){
        System.out.println("The salary of an employee is "+ salary);
    }
}

class Manager extends Employee1{
    int bonus = 100;
    void bonus(){
        System.out.println("The bonus of the manager is " + bonus);
    }
}

public class ass2{
    public static void main(String[] args) {
        Manager mn = new Manager();
        mn.bonus();
        mn.salary();
    }
}