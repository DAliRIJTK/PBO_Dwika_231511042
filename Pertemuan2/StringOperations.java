import java.util.Scanner;  // Mengimpor kelas Scanner untuk membaca input

public class StringOperations {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari sistem (biasanya dari keyboard)
        Scanner scanner = new Scanner(System.in);
        
        // Membaca input string pertama dari pengguna dan menyimpannya dalam variabel A
        System.out.print("Masukkan Kata1 : ");
        String A = scanner.nextLine();
        
        // Membaca input string kedua dari pengguna dan menyimpannya dalam variabel B
        System.out.print("Masukkan Kata2 : ");
        String B = scanner.nextLine();
        
        // Menghitung total panjang gabungan dari string A dan B
        int lengthSum = A.length() + B.length();
        // Mencetak panjang gabungan string A dan B
        System.out.println(lengthSum);
        
        // Membandingkan string A dengan B secara lexicographically
        if (A.compareTo(B) > 0) {
            // Jika A lebih besar dari B, mencetak "Yes"
            System.out.println("Yes");
        } else {
            // Jika A tidak lebih besar dari B, mencetak "No"
            System.out.println("No");
        }
        
        // Mengkapitalisasi huruf pertama dari string A dan menggabungkannya dengan sisa string A
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        // Mengkapitalisasi huruf pertama dari string B dan menggabungkannya dengan sisa string B
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        // Mencetak string A dan B yang telah dikapitalisasi, dipisahkan oleh spasi
        System.out.println(capitalizedA + " " + capitalizedB);
    }
}
