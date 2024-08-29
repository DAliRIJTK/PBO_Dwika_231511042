public class FloatingPoint {
    public static void main(String[] args) {
        // Mendeklarasikan variabel x dengan tipe double dan memberikan nilai 92.4
        double x = 92.4;
        
        // Membulatkan nilai x menggunakan Math.round(x) yang mengembalikan nilai long
        // Melakukan casting dari long ke int dan menyimpan hasilnya dalam variabel nx
        int nx = (int) Math.round(x);

        // Menampilkan nilai x sebelum dibulatkan
        System.out.println("Nilai x sebelum dibulatkan: " + x);

        // Menampilkan nilai nx setelah dibulatkan
        System.out.println("Nilai nx setelah dibulatkan: " + nx);
    }
}


 //* Nilai nx setelah di proses akan dibulatkan ke atas atau kebawah berdasarkan proses Math.round(x)*/
 //*Karena Math.round(x) mengembalikan nilai long, dan untuk menyimpannya dalam variabel int, diperlukan konversi eksplisit dari long ke int. */

