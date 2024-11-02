package akademik;

public class Ruangan {
    public String kodeRuangan;
    public String namaRuangan;

    public Ruangan(String kodeRuangan, String namaRuangan) {
        this.kodeRuangan = kodeRuangan;
        this.namaRuangan = namaRuangan;
    }

    public String getDetailRuangan() {
        return "Kode Ruangan: " + kodeRuangan + ", Nama Ruangan: " + namaRuangan;
    }
}
