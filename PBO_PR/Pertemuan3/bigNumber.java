import java.math.BigInteger;
import java.util.Scanner;

    public class bigNumber {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Masukkan bilangan A: ");
            String a = scanner.nextLine();
            System.out.print("Masukkan bilangan B: ");
            String b = scanner.nextLine();

            BigInteger A = new BigInteger(a);
            BigInteger B = new BigInteger(b);

            BigInteger tambah = A.add(B);
            BigInteger kurang = A.subtract(B);
            BigInteger kali = A.multiply(B);

            if (!B.equals(BigInteger.ZERO)) {
                BigInteger bagi = A.divide(B);
                System.out.println("Hasil dari " + A  + "/" +  B + " adalah: " + bagi);;
            } else {
                System.out.println("Tidak terdefinisi");
            }

            System.out.println("Hasil dari " + A  + "+" +  B + " adalah: " + tambah);
            System.out.println("Hasil dari " + A  + "-" +  B + " adalah: " + kurang);
            System.out.println("Hasil dari " + A  + "x" +  B + " adalah: " + kali);
        }
    }