package oop.advanced.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<>();
        countries.put("Romania", "Bucuresti");
        countries.put("Germania", "Berlin");
        countries.put("Austria", "Viena");
        System.out.println(countries);

        countries.put("Romania", "Iasi");
        System.out.println(countries);
        for(Map.Entry<String, String> entry: countries.entrySet()){
            System.out.printf("%s : %s\n", entry.getKey(), entry.getValue());
        }



    }
}
