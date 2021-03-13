package oop.advanced.exceptions.homework;

public class Main {
    public static void main(String[] args) throws MyException {


        //System.out.println("Input a value");
        String doubleString = "10.5";
        System.out.println(Double.parseDouble(doubleString));
        String doubleString1 = "10,5";
        System.out.println(Double.valueOf(Double.parseDouble(doubleString)));

/*        try (Scanner scanner = new Scanner(System.in)) {
            if (scanner.hasNextInt()) {
                int userValue = scanner.nextInt();
                System.out.println("Int ->" + userValue);
            } else if (scanner.hasNextDouble()) {
                double userValue = scanner.nextDouble();
                System.out.println(("Double ->" + userValue));
            } else {
                throw new MyException("Ati introdus un string");
            }
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }*/
    }
}
