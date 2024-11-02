public class Mahasiswa extends Orang {
    private String NIM;
    private MataKuliah mataKuliah;

    public Mahasiswa(String nama, String nim, MataKuliah mataKuliah) {
        super(nama);
        this.NIM = nim;
        this.mataKuliah = mataKuliah;
    }

    @Override
    public void berbicara() {
        System.out.println(nama + " sedang bertanya kepada dosen");
    }

    @Override
    public void mendengar() {
        System.out.println(nama + " sedang mendengarkan dosen menjelaskan tentang " + mataKuliah.getNamaMataKuliah());
    }

    @Override
    public void aktivitas() {
        System.out.println(nama + " sedang mengerjakan tugas kuliah " + mataKuliah.getNamaMataKuliah());
    }
}
