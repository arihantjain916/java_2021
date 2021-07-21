import java.util.*;

public class linked_list {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.addFirst(0); // this is used to initalize value at fisrt position. 
        l1.addLast(7); // this is used to initalize value at last position.
        // l1.remove(3); // it is used to remove the value present at given index.
        // System.out.println(l1);
        // l1.clear(); //it is used to clear the data of the array list.
        for(int i = 0;i<l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(" , ");
        }
    }
}
