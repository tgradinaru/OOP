package oop.abstraction;

public class Cat {
    private int mood; //daca nu pun modificator de acces 'private' se vede doar in pachet adica e 'default'
    private int energy;
    private int hungry; // tipul variabilei nu e niciodata void!

    ////////
    // public este vizibil si din alte pachete
    // private este vizibil doar in clasa
    // default este vizibil doar in interiorul pachetului
    ///////

    private void meow() {        //void pt ca nu returneaza nimic
        System.out.println("meow");
    }

    public void sleep(){
        hungry++;           //nu primim variabile si nu e nevoie de 'this.'
        energy++;
    }

    public void play(){
        mood++;
        energy--;
        meow();
    }

    public void feed(){
        hungry--;
        mood++;
        meow();
    }

    @Override                   // suprascrierea metodei toString din clasa Objects
    public String toString() {
        return "Cat{" +
                "mood=" + mood +
                ", energy=" + energy +
                ", hungry=" + hungry +
                '}';
    }
}
