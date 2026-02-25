import java.util.*;
import java.util.stream.*;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "aabbcddee";

        Character result = str.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(e -> e.getKey())
                .findFirst()
                .orElse(null);

        System.out.println(result);
    }
}
