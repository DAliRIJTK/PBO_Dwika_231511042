package akademik;

public class MataKuliah {
    public String namaMataKuliah;
    public String kodeMataKuliah;

    public MataKuliah(String namaMataKuliah, String kodeMataKuliah) {
        this.namaMataKuliah = namaMataKuliah;
        this.kodeMataKuliah = kodeMataKuliah;
    }

    public String getDetailMataKuliah() {
        return "Mata Kuliah: " + namaMataKuliah + ", Kode: " + kodeMataKuliah;
    }
}
