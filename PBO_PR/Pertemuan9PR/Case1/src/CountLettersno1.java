// ****************************************************************
// CountLettersno1.java
//
// Reads a words from the standard input and prints the number of
// occurrences of each letter in that word.
//Using Try-Catch to ignore error
//
// ****************************************************************123

import java.util.Scanner;

public class CountLettersno1 {
    public static void main(String[] args){
        int[] counts = new int[26];
        Scanner scan = new Scanner(System.in);

         System.out.print("Masukkan suatu kata (hanya boleh huruf) : ");
         String word = scan.nextLine();

        word = word.toUpperCase();

        //Hitung frekuensi dari tiap huruf
        for (int i = 0; i < word.length(); i++) {
            try {
                counts[word.charAt(i)- 'A']++;
            } catch (ArrayIndexOutOfBoundsException e){
                return;
            }
        }

        System.out.println();
        for (int i = 0; i < counts.length; i++){
            if (counts[i] != 0) {
                System.out.println("Huruf " + (char)(i + 'A') + ": " + counts[i]);
            }
        }
    }
}

