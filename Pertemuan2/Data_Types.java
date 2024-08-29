import java.util.Scanner;  // Mengimpor kelas Scanner untuk membaca input

public class Data_Types {  // Mendeklarasikan kelas Data_Types

    public static void main(String[] args) {  // Titik masuk utama program
        Scanner scanner = new Scanner(System.in);  // Membuat objek Scanner untuk membaca input dari sistem
        
        // Sample Input
        String[] sampleInput = {  // Mendeklarasikan array berisi string angka untuk diuji
            "-150",
            "150000",
            "1500000000",
            "213333333333333333333333333333333333",
            "-100000000000000"
        };
        
        int T = sampleInput.length;  // Menyimpan jumlah elemen dalam array sampleInput
        
        for (int i = 0; i < T; i++) {  // Memulai loop untuk setiap elemen dalam array sampleInput
            try {  // Memulai blok try untuk menangani kemungkinan pengecualian
                long n = Long.parseLong(sampleInput[i]);  // Mengonversi string ke long
                System.out.println(n + " can be fitted in:");  // Mencetak pesan bahwa n dapat dimuat dalam tipe data
                
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {  // Mengecek apakah n dapat dimuat dalam byte
                    System.out.println("* byte");  // Mencetak "* byte" jika sesuai
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {  // Mengecek apakah n dapat dimuat dalam short
                    System.out.println("* short");  // Mencetak "* short" jika sesuai
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {  // Mengecek apakah n dapat dimuat dalam int
                    System.out.println("* int");  // Mencetak "* int" jika sesuai
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {  // Mengecek apakah n dapat dimuat dalam long
                    System.out.println("* long");  // Mencetak "* long" jika sesuai
                }
                
            } catch (Exception e) {  // Menangkap pengecualian yang terjadi selama parsing
                System.out.println(sampleInput[i] + " can't be fitted anywhere.");  // Mencetak pesan kesalahan
            }
        }
        
        scanner.close();  // Menutup objek Scanner
    }
}
