import java.util.Scanner;  // Mengimpor kelas Scanner untuk membaca input

public class Data_Types {  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Membuat objek Scanner untuk membaca input
        
        // Sample Input
        String[] sampleInput = {  // Mendeklarasikan array berisi string angka
            "-150",
            "150000",
            "1500000000",
            "213333333333333333333333333333333333",
            "-100000000000000"
        };
        
        int T = sampleInput.length;  // Menyimpan jumlah elemen dalam array sampleInput
        
        for (int i = 0; i < T; i++) {  // Memulai loop untuk setiap elemen dalam array sampleInput
            try {  //  untuk menangani kemungkinan pengecualian
                long n = Long.parseLong(sampleInput[i]);  // Mengonversi string ke long
                System.out.println(n + " Dapat digunakan :");  // Mencetak pesan bahwa n dapat digunakan
                
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {  // Mengecek apakah n dapat dimuat dalam byte
                    System.out.println("* byte");  // Mencetak "* byte" jika benar
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {  // Mengecek apakah n dapat dimuat dalam short
                    System.out.println("* short");  // Mencetak "* short" jika benar
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {  // Mengecek apakah n dapat dimuat dalam int
                    System.out.println("* int");  // Mencetak "* int" jika benar
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {  // Mengecek apakah n dapat dimuat dalam long
                    System.out.println("* long");  // Mencetak "* long" jika benar
                }
                
            } catch (Exception e) {  // Menangkap pengecualian yang terjadi
                System.out.println(sampleInput[i] + " Tidak dapat digunakan.");  // Mencetak pesan kesalahan
            }
        }
        
        scanner.close();  // Menutup objek Scanner
    }
}
