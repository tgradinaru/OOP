package oop.advanced.anonymousInnerClass;

import java.util.Arrays;

public class IntSequence implements IntegerNumber {

    @Override
    public void getList() {
        System.out.println("List is " + Arrays.toString(list));
    }
}
