public class ConvertDataType {

    static short methodOne(long l) {
        // Mengonversi long l menjadi int
        int i = (int) l;
        // Mengonversi int i menjadi short dan mengembalikan hasilnya
        return (short) i;
    }
    
    public static void main(String[] args) {
        // Mendeklarasikan variabel d dengan tipe double
        double d = 10.25;

        // Mengonversi double d menjadi float
        float f = (float) d;

        // Mengonversi float f menjadi long, lalu memanggil methodOne untuk mengonversi long ke short,
        // dan akhirnya mengonversi short menjadi byte
        byte b = (byte) methodOne((long) f);

        // Menampilkan nilai byte b
        System.out.println(b); 
    }
}


//* d dengan type data double bernilai 10.25 diubah menjadi type data float akan bernial 10.25 yang ditampung pada f */
//* Lalu f dikonversi long yang di proses 10l menjadi integer lalu di ubah menjadi tipe data byte */ 