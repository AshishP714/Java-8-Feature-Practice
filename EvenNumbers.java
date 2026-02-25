import java.util.*;
import java.util.stream.*;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 3, 5, 8, 2);

        List<Integer> evenNumbers = list.stream()
                                        .filter(n -> n % 2 == 0)
                                        .collect(Collectors.toList());

        System.out.println(evenNumbers);
    }
}
