package com.polban.jtk.main;

public class Main {
    // Define the Product class
    public static class Product {
        private String productName;
        private double price;
        private int stock;

        public Product(String productName, double price, int stock) {
            this.productName = productName;
            this.price = price;
            this.stock = stock;
        }

        public String getProductName() {
            return productName;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            if (price > 0) {
                this.price = price;
            } else {
                System.out.println("Harga tidak valid!");
            }
        }

        public int getStock() {
            return stock;
        }

        public void addStock(int amount) {
            if (amount > 0) {
                this.stock += amount;
            } else {
                System.out.println("Jumlah stok tidak valid!");
            }
        }

        public void sellProduct(int quantity) {
            if (quantity > 0 && quantity <= stock) {
                stock -= quantity;
                System.out.println(quantity + " " + productName + " terjual.");
            } else {
                System.out.println("Jumlah stok tidak cukup untuk penjualan.");
            }
        }
    }

    // Define the Sales class
    public static class Sales {
        private Product product;

        public Sales(Product product) {
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

    // Define the Barang class
    public static class Barang {
        private String kode_barang;
        private String nama_barang;
        private int stok;

        public Barang(String kode, String nama, int stok) {
            kode_barang = kode;
            nama_barang = nama;
            this.stok = stok;
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

    // Define the Inventori class
    public static class Inventori {
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
    }

    public static void main(String[] args) {
        // Product-related operations
        Product laptop = new Product("Laptop", 15000000, 10);
        Sales laptopSales = new Sales(laptop);

        // Perform operations
        laptopSales.sellProduct(3);
        laptopSales.restockProduct(5);
        laptopSales.updateProductPrice(14000000);
        laptopSales.updateProductPrice(-5000000);

        // Inventory-related operations
        Inventori inventori = new Inventori();
        inventori.pengadaan();
    }
}
