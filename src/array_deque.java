import java.util.*;

public class array_deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> d1 = new ArrayDeque<>();
        d1.add(1);
        d1.add(2);
        d1.add(3);
        d1.add(4);
        d1.add(5);
        d1.addFirst(0);
        d1.addLast(6);
        System.out.println(d1.getFirst()); // it give the first element of the deque.
        System.out.println(d1.getLast()); // it give the last element of the deque.
    }
}
