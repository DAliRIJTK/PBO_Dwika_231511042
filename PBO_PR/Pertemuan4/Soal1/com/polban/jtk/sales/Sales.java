package com.polban.jtk.sales;

class Sales {
    private com.polban.jtk.sales.Product product;

    public Sales(com.polban.jtk.sales.Product product) {
        this.product = product;
    }

    public void sellProduct(int quantity) {
        System.out.println("Memproses penjualan...");
        product.sellProduct(quantity);
        System.out.println("Stok setelah penjualan: " + product.getStock());
    }

    public void restockProduct(int quantity) {
        System.out.println("Menambah stok...");
        product.addStock(quantity);
        System.out.println("Stok setelah penambahan: " + product.getStock());
    }

    public void updateProductPrice(double newPrice) {
        System.out.println("Memperbarui harga produk...");
        product.setPrice(newPrice);
        System.out.println("Harga baru: " + String.format("%.2f", product.getPrice()));
    }
}

