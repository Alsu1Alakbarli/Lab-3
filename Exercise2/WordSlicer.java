package Exercise2;

import java.util.Scanner;

public class WordSlicer {

    public static void printSlices(String word) {
        System.out.println(word); // print the full word first

        for (int i = 1; i < word.length(); i++) {
            String firstPart = word.substring(0, i);
            String secondPart = word.substring(i);
            System.out.println(firstPart + " " + secondPart);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine().trim();
        
        System.out.println("\nSlices:");
        printSlices(word);
    }
}

