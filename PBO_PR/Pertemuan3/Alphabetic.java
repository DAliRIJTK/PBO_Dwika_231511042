import java.util.Scanner;

public class Alphabetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kata : ");
        String s = scanner.nextLine();
        scanner.close();

        String[] split = s.split("[^A-Za-z0-9]+");

        int Hitung = 0;
        for (String token : split) {
            if (!token.isEmpty()) {
                Hitung++;
            }
        }

        System.out.println(Hitung);

        for (String token : split) {
            if (!token.isEmpty()) {
                System.out.println(token);
            }
        }
    }
}
