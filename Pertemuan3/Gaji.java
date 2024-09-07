import java.util.Scanner;

public class Gaji {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah penjualan bulan ini: ");
        int jumlahPenjualan = scanner.nextInt();
        scanner.close();

        final int GajiPokok = 500000;
        final int HargaItem = 50000;
        final double BonusPerItem = 0.10;
        final double Bonus25 = 0.25;
        final double Bonus35 = 0.35;
        final double Denda = 0.15;

        double gajiTotal = GajiPokok;
        double totalPenjualan = jumlahPenjualan * HargaItem;

        // Menghitung bonus per item
        double bonusItem = jumlahPenjualan * HargaItem * BonusPerItem;

        // Menghitung bonus penjualan
        double bonusPenjualan = 0;
        if (jumlahPenjualan >= 40 && jumlahPenjualan <= 80) {
            bonusPenjualan = totalPenjualan * Bonus25;
        } else if (jumlahPenjualan > 80) {
            bonusPenjualan = totalPenjualan * Bonus35;
        }

        // Menghitung denda
        double denda = 0;
        if (jumlahPenjualan < 15) {
            int minusPenjualan = 15 - jumlahPenjualan;
            denda = (minusPenjualan * HargaItem) * Denda;
        }

        // Menghitung gaji total
        gajiTotal += bonusItem + bonusPenjualan - denda;

        // Menampilkan hasil
        System.out.println((int)gajiTotal);
    }
}
