package oop.advanced.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ana", "Johanna", "Mary");
        Stream<String> namesStream = names.stream();

        List<String> namesCopy = names.stream().collect(Collectors.toList());
        System.out.println(namesCopy);


        Optional<String> firstElement = names.stream().findFirst();
        if (firstElement.isPresent()) {
            System.out.println(firstElement.get());
        }

        List<String> nameStartingWithJ = names.stream()
                .filter(element -> element.startsWith("J"))
                .collect(Collectors.toList());
        System.out.println(nameStartingWithJ);

        List<Integer> wordSize = names.parallelStream()     //parralelStream
                .filter(element -> element.endsWith("a"))
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(wordSize);

        System.out.println("************************");
        names.stream().forEach(element-> System.out.println(element));
    }
}
