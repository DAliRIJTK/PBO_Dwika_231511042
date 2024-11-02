package akademik;

public class Mahasiswa extends Person {
    public String NIM;
    public String jurusan;
    public String prodi;

    public Mahasiswa(String nama, String alamat, String telepon, String NIM, String jurusan, String prodi) {
        super(nama, alamat, telepon);
        this.NIM = NIM;
        this.jurusan = jurusan;
        this.prodi = prodi;
    }

    public String getDetailMahasiswa() {
        return super.getDetail() + ", NIM: " + NIM + ", Jurusan: " + jurusan + ", Prodi: " + prodi;
    }
}
