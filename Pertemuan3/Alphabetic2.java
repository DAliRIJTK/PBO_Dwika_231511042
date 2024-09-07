import java.util.Scanner;

public class Alphabetic2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] a = new String[3];
        int[] b = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Masukkan Kata : ");
            a[i] = scanner.next();
            System.out.print("Masukkan Angka : ");
            b[i] = scanner.nextInt();
        }

        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s%03d%n", a[i], b[i]);
        }
        System.out.println("================================");

        scanner.close();
    }
}
