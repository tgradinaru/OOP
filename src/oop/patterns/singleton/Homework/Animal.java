package oop.patterns.singleton.Homework;

public class Animal {
    private static Animal instance;
    private String type;

    private Animal(){       //daca constructorul este private nu se mai poate instantia cu new
        System.out.println("S-a apelat constructorul Animal");
    }

    public static Animal getInstance(){
        if (instance == null){
            synchronized (Animal.class){
                if (instance == null){
                    instance = new Animal();
                }
            }
        }
        return instance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
