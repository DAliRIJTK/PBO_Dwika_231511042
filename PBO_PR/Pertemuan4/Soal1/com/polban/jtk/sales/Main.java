package com.polban.jtk.sales;

public class Main {
    public static void main(String[] args) {
        // 1. Buat object product dengan quantity produk 10
        com.polban.jtk.sales.Product laptop = new com.polban.jtk.sales.Product("Laptop", 15000000, 10);

        // 3. Buatlah object sales
        com.polban.jtk.sales.Sales laptopSales = new com.polban.jtk.sales.Sales(laptop);

        // 4. Lakukan penjualan produk dengan quantity 5
        laptopSales.sellProduct(3);

        // 5. Lakukan restock produk
        laptopSales.restockProduct(5);

        // 6. Lakukan memperbaharui harga produk
        laptopSales.updateProductPrice(14000000);

        // 7. Coba lakukan memperbaharui harga produk dengan nilai negative
        laptopSales.updateProductPrice(-5000000);
    }
}