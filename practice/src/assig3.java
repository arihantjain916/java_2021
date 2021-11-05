// Write a program to create(or iterate )Array list?
// Use its methods to add, remove etc elements
import java.util.ArrayList;
public class assig3 {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(10);
        ArrayList<Integer> l2 = new ArrayList<>(10);
        for(int i=0; i<10; i++){
            l1.add(i);
        }
        for(int i=10; i<21; i++){
            l2.add(i);
        }
        l1.add(6 , 7);
        l1.addAll(l2);
        l1.remove(5);
        System.out.println(l1);
    }
}
