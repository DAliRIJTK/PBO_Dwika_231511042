import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        do {
            System.out.print("Masukkan angka pertama dari 0 - 1000: ");
            a = scanner.nextInt();
            if (a < 0 || a > 1000) {
                System.out.println("Angka harus antara 0 sampai 1000!");
            }
        } while (a < 0 || a > 1000);

        System.out.print("Masukkan operator (+, -, *, x, /, %): ");
        String operator = scanner.next();

        do {
            System.out.print("Masukkan angka kedua dari 0 - 1000: ");
            b = scanner.nextInt();
            if (b < 0 || b > 1000) {
                System.out.println("Angka harus antara 0 sampai 1000!");
            }
        } while (b < 0 || b > 1000);

        int result;

        switch (operator) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "*":
            case "x":
                result = a * b;
                break;
            case "/":
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Tidak terdefinisi");
                    return;
                }
                break;
            case "%":
                result = a % b;
                break;
            default:
                System.out.println("Operator tidak valid");
                return;
        }

        System.out.println("Hasil dari " + a + operator +  b + " adalah: " + result);
    }
}
