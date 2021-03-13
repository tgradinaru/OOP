package oop.advanced.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /**I/O Serializable*/
/*        File personFile = new File("C:/TEST/person.txt");
        if (!personFile.exists()) {
            personFile.createNewFile();
        }
        Person person = new Person("Traian", "Gradinaru");

        System.out.println("Before serialization " + person);
        try (FileOutputStream fileOutputStream = new FileOutputStream(personFile); //Output = scriere
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(person);     //aici am serializat fisierul
        }

        Person person1;

        try (FileInputStream fileInputStream = new FileInputStream(personFile); //Input = citire
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            person1 = (Person) objectInputStream.readObject(); //aici am deserializat fisierul
        }
        System.out.println("After deserialization" + person1);*/


        /** INPUT/OUTPUT FILE*/

        File absolutFile = new File("C:/TEST/test.txt");
        File outputFile = new File("C:/TEST/output.txt");
        if (!outputFile.exists()) {

            outputFile.createNewFile();
        }

        try (BufferedReader bufferReader = new BufferedReader(new FileReader(absolutFile));
             BufferedWriter bufferWriter = new BufferedWriter(new FileWriter(outputFile))) {
            String fileLine;
            while ((fileLine = bufferReader.readLine()) != null) {
                System.out.println(fileLine);
                bufferWriter.append(fileLine);//aici copiem continutul din celalalt fisier
                bufferWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("********READ FROM FILE FROM PATH ************");
        Path outputPath = Paths.get("C:/TEST/output.txt");
        List<String> myLines = Files.readAllLines(outputPath);
        System.out.println(myLines);

        Path outputPath1 = Paths.get("C:/TEST/newOutput.txt"); // daca punem ./ inainte de numele fisierului
        if (!Files.exists(outputPath1)) {
            Files.createFile(outputPath1);
        }
        //Files.write(outputPath1,"*************",StandardOpenOption.APPEND);
        Files.write(outputPath1, myLines, StandardOpenOption.APPEND);//la path-ul nou scriem myLines
    }
}
