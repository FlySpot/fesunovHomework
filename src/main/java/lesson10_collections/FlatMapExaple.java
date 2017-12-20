package lesson10_collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by FlySpot on 21.12.2017.
 */
public class FlatMapExaple {
    public static void main (String[] args) {
        List<String> firstNames = Arrays.asList("Jony","Igor","Roman");
        List<String> lastNames = Arrays.asList("Be","Moris","Keyn");

        List<String> names = Stream
                .of(firstNames, lastNames)
                .flatMap(l -> l.stream())
                .collect(Collectors.toList());
        names.forEach(System.out::println);

    }
}
