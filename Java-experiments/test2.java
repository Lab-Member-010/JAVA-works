import java.util.*;

public class test2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        Collections.sort(numbers, (a, b) -> b - a);

        System.out.println(numbers);
    }
}