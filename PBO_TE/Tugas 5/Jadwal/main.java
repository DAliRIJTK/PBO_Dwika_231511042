public class main {
    public static void main(String[] args){
        Dosen dosen1 = new Dosen("", "Pemrograman Berorientasi Objek");
        MataKuliah MK1 = new MataKuliah("", "Pemrograman Berorientasi Objek", dosen1);
        Mahasiswa mhs1 = new Mahasiswa("Dwika Ali Ramdhan", "231511042", MK1);
        Kelas kelas1 = new Kelas("", MK1, dosen1);

        dosen1.namaOrang();
        dosen1.berbicara();
        dosen1.mendengar();
        dosen1.aktivitas();

        System.out.println(" ");

        mhs1.namaOrang();
        mhs1.berbicara();
        mhs1.mendengar();
        mhs1.aktivitas();

        System.out.println(" ");

        MK1.dataMataKuliah();

        System.out.println(" ");

        kelas1.dataKelas();

    }
}
