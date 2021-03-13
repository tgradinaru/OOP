package oop.patterns.singleton;


    public class Main {
        public static void main(String[] args) {
            Sun sun1 = Sun.getInstance();
            Sun sun2 = Sun.getInstance();
            Sun.getInstance();
            Sun.getInstance();
            Sun.getInstance();
            Sun.getInstance();
            Sun.getInstance();
            Sun.getInstance();
            Sun.getInstance();
            Sun.getInstance();
            Sun.getInstance();

            System.out.println(sun1 == sun2);
        }
    }

