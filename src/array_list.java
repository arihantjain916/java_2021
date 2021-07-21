import java.util.*;
public class array_list {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5); // here we give the array list size of 5.
        l2.add(10);
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(6);
        l1.add(6 , 7); // it is used to add the value at given index.(Here index is 6 and the value is 7).
        l1.addAll(l2); // this is used to add two collections. This add at last position by default.
        // If you want to add second collection at initial position then you have to give index 0. (for eg: l1.addAll(0 , l2);)
        // l1.remove(3); // it is used to remove the value present at given index.
        // System.out.println(l1);
        // l1.clear(); //it is used to clear the data of the array list.
        // for(int i = 0;i<l1.size(); i++){
        //     System.out.print(l1.get(i));
        //     System.out.print(" , ");
        // }
        // this is used to print value seprately
        // System.out.println(l1.contains(7)); // it give boolean result true if given value is present and false if not.
        // System.out.println(l1.indexOf(7)); // it give the index of given value.
        // System.out.println(l1.lastIndexOf(7)); // if we have same value more than once then thisfunction give us the index of last value given. 
        // l1.set(0, 8); //this is used to set value at given index.
        // System.out.println(l1.isEmpty()); // it is used to check whether the array list is empty or not.
        // l1.trimToSize(); // it remove the empty spaces in array list.
        // l1.ensureCapacity(5); // it is used to increase the size of the array list by giving min value to be stored.
        // System.out.println(l1.hashCode()); // it give the hash code of the array list.
    }
}
