import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author  by Anton Shtylenko
 */

public class Task06 {
    public static void main(String[] args) {
        Scanner fileScanner;

        try {
            fileScanner = new Scanner(new File("E:\\JavaAdvancedIBS\\src\\main\\java\\Text example"));
        } catch (FileNotFoundException e) {
            System.out.println("File does not exists");
            return;
        } catch (NullPointerException e) {
            System.out.println("!");
            return;
        }


        TreeMap<String, Integer> words = new TreeMap<>();
        int max = 0;
        String maxWord = null;
        while (fileScanner.hasNext()) {
            String word = fileScanner.next();
            int counter = words.getOrDefault(word, 0);
            counter++;
            if (counter > max) {
                max = counter;
                maxWord = word;
            }
            words.put(word, counter);
        }

        System.out.println("the words in the file are in alphabetical order: " + words.keySet());

        System.out.println("Statistics of counter words: ");
        words.forEach((key, value) -> System.out.println(key + ": " + value + " раз(а)"));

        System.out.println("The word with the maximum number of repetitions: " + "'" + maxWord + "'" +  " number of repeat: " + max);
    }
}