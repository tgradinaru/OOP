package oop.advanced.io.homework;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File checkedFile = new File("C:/TEST/loremipsum.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(checkedFile));
        String fileContent = "";
        String fileLine;
//        int spaces = 0;
//        int commas = 0;
//        int dots = 0;
        //fileContent = bufferedReader.readLine();
        while ((fileLine = bufferedReader.readLine()) != null) {
            fileContent += fileLine;
            fileContent += " ";
        }
        System.out.println(fileContent);
        System.out.println("Word's number: " + countWords(fileContent));
        countSpacialCharacters(fileContent);
        System.out.println("************************");
        System.out.println("No of occurences " + numberOfOccurences(fileContent, "amet"));
    }

    public static int countWords(String text) {
        String[] wordsArray = text.split(" ");
        return wordsArray.length;
    }

    public static void countSpacialCharacters(String text) {
        int spaces = 0;
        int commas = 0;
        int dots = 0;
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == ' ') {
                spaces++;
            } else if (text.charAt(i) == ',') {
                commas++;
            } else if (text.charAt(i) == '.') {
                dots++;
            }
        }
        System.out.println("No of spaces: " + spaces);
        System.out.println("No of commas: " + commas);
        System.out.println("No of dots: " + dots);
    }

    public static int numberOfOccurences(String text, String word) {
        String[] wordsArray = text.split(" ");
        int count = 0;
        for (int i = 0; i < wordsArray.length; i++) {
            String myWord = wordsArray[i];
            if ((myWord.charAt(myWord.length() - 1) < 65) || myWord.charAt(myWord.length() - 1) > 122 ||
                    ((myWord.charAt(myWord.length() - 1) < 97) && myWord.charAt(myWord.length() - 1) > 90)) {
                myWord = myWord.substring(0, myWord.length() - 1);
            }
            if (myWord.equals(word)) {
                count++;
            }
        }
        return count;
    }
}
