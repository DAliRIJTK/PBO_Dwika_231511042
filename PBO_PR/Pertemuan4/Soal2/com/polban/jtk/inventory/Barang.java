package com.polban.jtk.inventory;

public class Barang {
    private String kode_barang;
    private String nama_barang;
    private int stok;

    public Barang(String kode, String nama, int Stok) {
        kode_barang = kode;
        nama_barang = nama;
        Stok = Stok;
    }

    public String getNamaBarang() {
        return nama_barang;
    }

    public int getStok() {
        return stok;
    }

    // Method to only allow addition to stok
    public void tambahStok(int jumlah) {
        if (jumlah > 0) {
            stok += jumlah;
        } else {
            System.out.println("Hanya bisa menambah stok, nilai harus positif.");
        }
    }
}