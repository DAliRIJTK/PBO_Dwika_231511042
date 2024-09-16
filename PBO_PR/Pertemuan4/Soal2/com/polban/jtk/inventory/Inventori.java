package com.polban.jtk.inventory;

public class Inventori {
    Barang[] barang;

    void initBarang() {
        barang = new Barang[2];
        barang[0] = new Barang("001", "Baju", 10);
        barang[1] = new Barang("002", "Celana", 20);
    }

    void showBarang() {
        System.out.println(barang[0].getNamaBarang() + " (" + barang[0].getStok() + ")");
        System.out.println(barang[1].getNamaBarang() + " (" + barang[1].getStok() + ")");
    }

    void pengadaan() {
        initBarang();
        barang[0].tambahStok(20);
        barang[1].tambahStok(10);
        showBarang();
    }

    public static void main(String[] args) {
        Inventori beli = new Inventori();
        beli.pengadaan();
    }
}

