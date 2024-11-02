// ****************************************************************
// ParseInts.java
//
// Version 1 and Version 2
// Version 1: Try-catch around the entire loop
// Version 2: Try-catch inside the loop
//
// ****************************************************************
import java.util.Scanner;

public class ParseInts1 {
    public static void main(String[] args) {
        int val, sum = 0;
        Scanner scan = new Scanner(System.in);
        String line;

        System.out.println("Enter a line of text");
        Scanner scanLine = new Scanner(scan.nextLine());

        // Version 1: Try-catch around the entire loop
        // This will stop at the first non-integer
        try {
            while (scanLine.hasNext()) {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            }
        } catch (NumberFormatException e) {
            // Empty catch block - silently ignore non-integers
        }

        System.out.println("Version 1 - The sum of the integers on this line is " + sum);

        // Reset for Version 2
        scanLine.close();
        System.out.println("\nEnter another line of text");
        scanLine = new Scanner(scan.nextLine());
        sum = 0;

        // Version 2: Try-catch inside the loop
        // This will process the entire line, skipping non-integers
        while (scanLine.hasNext()) {
            try {
                val = Integer.parseInt(scanLine.next());
                sum += val;
            } catch (NumberFormatException e) {
                // Empty catch block - silently ignore non-integers
            }
        }

        System.out.println("Version 2 - The sum of the integers on this line is " + sum);

        scanLine.close();
        scan.close();
    }
}

