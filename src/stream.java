import java.util.*;
import java.util.stream.*;

public class stream {
    public static void main(String[] args) {
        // a simple program to demonstrate the use of stream in java

        // create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        // demonstration of map method
        List<Integer> square = number.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println("Square of numbers are " + square);

        // create a list of String
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");

        // demonstration of filter method
        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println("String which start with letter S is " + result);

        // demonstration of sorted method
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println("Value stored in List is " + show);

        // create a list of integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 2);

        // collect method returns a set
        Set<Integer> squareSet = numbers.stream().map(x -> x * x).collect(Collectors.toSet());
        System.out.println("the square of elements of lists are " + squareSet); // this eleminate the repition of the element

        // demonstration of forEach method
        number.stream().map(x -> x * x).forEach(y -> System.out.println("Square of element are " + y));

        // demonstration of reduce method
        int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);

        System.out.println("The even numbers are " + even);

    }
}
