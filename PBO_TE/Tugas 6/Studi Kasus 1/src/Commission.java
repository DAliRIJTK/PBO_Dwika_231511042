//*************************************************************
//  Commission.java
//  Studi Kasus 1
//  Polimorfisme dan pewarisan dengan menambahkan kelas Commission sebagai tipe pegawai baru.
//*************************************************************

public class Commission extends Hourly {
    private double totalSales;
    private final double commissionRate;

    // Constructor: Meneruskan 5 parameter pertama ke Hourly dan menetapkan commissionRate.
    public Commission(String eName, String eAddress, String ePhone,
                      String socSecNumber, double rate, double commissionRate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
        this.totalSales = 0;
    }

    // Menambahkan total penjualan untuk pegawai ini.
    public void addSales(double sales) {
        totalSales += sales;
    }

    // Menghitung gaji dengan menambahkan komisi dari penjualan.
    @Override
    public double pay() {
        double payment = super.pay() + (totalSales * commissionRate);
        totalSales = 0;  // Reset total sales setelah pembayaran.
        return payment;
    }

    // Mengembalikan informasi lengkap pegawai dengan total penjualan.
    @Override
    public String toString() {
        return super.toString() + "\nTotal Sales: " + totalSales;
    }
}
