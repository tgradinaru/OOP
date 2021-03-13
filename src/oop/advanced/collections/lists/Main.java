package oop.advanced.collections.lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> counties = new ArrayList<>();
        counties.add("Brasov");
        counties.add("Maramures");
        counties.add("Cluj");

        System.out.println(counties.indexOf("Cluj"));
        System.out.println(counties.size());

        System.out.println("**After remove***");
        System.out.println(counties.remove("Brasov"));

        System.out.println(counties.indexOf("Cluj"));
        System.out.println(counties.size());

        System.out.println(counties);

/*
        System.out.println("***show list with for clasic**");
        for (int i = 0; i < counties.size(); i++) {     //FIRST mod de a parcurge list
            System.out.println(counties.get(i));
        }
        System.out.println("***show list with forEach**");
        for (String element : counties) {               // SECOND mod de a parcurge o lista
            System.out.println(element);                // iti da doar valoarea elementului si nu vezi la ce index e
        }
        System.out.println("***show list with forEach**");
        counties.forEach(System.out::println);          // THIRD mod de a parcurge o lista
                                                        //// iti da doar valoarea elementului si nu vezi la ce index e

        System.out.println("****show list with ITERATOR****");            // ITERATOR
        Iterator<String> iterator = counties.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
    }
}
