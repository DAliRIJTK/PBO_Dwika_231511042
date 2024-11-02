import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want to sort?");
        int numItems = scan.nextInt();
        Integer[] numbers = new Integer[numItems];

        System.out.println("Enter the numbers:");
        for (int i = 0; i < numItems; i++) {
            numbers[i] = scan.nextInt();  // Autoboxing akan mengubah int menjadi Integer
        }

        Sorting.selectionSort(numbers);

        System.out.println("Your numbers in sorted order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
