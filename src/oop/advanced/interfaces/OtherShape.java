package oop.advanced.interfaces;

public interface OtherShape {
    default void print(){
        System.out.println("test");
    }
}
