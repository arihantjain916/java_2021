import java.util.*;
public class assig3a {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(10);
        for(int i=0; i<10;i++){
            l1.add(i);
        }
        
        for(int i = 0;i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(" , ");
        }
        System.out.println();
        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(7));
        l1.set(0, 8);
        System.out.println(l1.isEmpty());
        l1.trimToSize();
        l1.ensureCapacity(5);
        System.out.println(l1.hashCode());
        l1.clear();
    }
}