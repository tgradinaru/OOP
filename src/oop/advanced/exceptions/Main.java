package oop.advanced.exceptions;

public class Main {

    public static void main(String[] args) {
        /** Try catch Finally*/
        try {
            /*String text = null;
            text.toString();
            int x = 5 / 0;*/
            int[] array = {5, 7};
            int index = 3;
            printArrayElement(array,index);

        } catch (ArithmeticException arithmeticException) {
            System.out.println("Arithmetic exception : " + arithmeticException.getMessage());
        } catch (MyException myException){
            System.out.println("My exception was trown");
        }
        /*catch (Exception e) {
            System.out.println("Exception is caught and handled! : " + e.getMessage());
        }*/ finally {
            System.out.println("This will be printed no matter what the value of is");
        }

    }

    public static void printArrayElement(int[] array, int index) throws MyException {
        if (index < 0 || index >= array.length) {
            throw new MyException("Incorrect index value");
        }
        System.out.println(array[index]);
    }
}
