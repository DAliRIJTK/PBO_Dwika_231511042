import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many strings do you want to sort?");
        int numItems = scan.nextInt();
        scan.nextLine();  // Consume newline

        String[] strings = new String[numItems];

        System.out.println("Enter the strings:");
        for (int i = 0; i < numItems; i++) {
            strings[i] = scan.nextLine();
        }

        Sorting.selectionSort(strings);

        System.out.println("Your strings in sorted order:");
        for (String str : strings) {
            System.out.print(str + " ");
        }
    }
}
