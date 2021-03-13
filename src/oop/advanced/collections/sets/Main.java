package oop.advanced.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> notes = new HashSet<>();
        notes.add(10);
        notes.add(9);
        notes.add(8);
        notes.add(7);
        notes.add(6);
        notes.add(5);
        System.out.println(notes.toString());
        for (Integer element : notes) {
            System.out.println(element);
        }
    }
}
