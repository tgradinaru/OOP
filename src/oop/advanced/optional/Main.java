package oop.advanced.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> stringEmptyOptional1 = Optional.empty();
        System.out.println(stringEmptyOptional1.isPresent());

        String myString = "ABCDEF";
        Optional<String> stringOptional = Optional.of(myString);
        if (stringOptional.isPresent()) {
            System.out.println(stringOptional.get());
        }

        String myString2 = null;
        Optional<String> stringOptional2 = Optional.ofNullable(myString2);
        if (stringOptional2.isPresent()) {
            System.out.println(stringOptional2.get());
        }

        String myString3 = null;
        Optional<String> stringOptional3 = Optional.ofNullable(myString3);
        stringOptional3.orElse("default value");
        if (stringOptional3.isPresent()) {
            System.out.println(stringOptional2.get());
        } else {
            System.out.println(stringOptional3.orElse("default value"));
        }
    }
}
