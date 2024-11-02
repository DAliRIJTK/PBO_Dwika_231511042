package akademik;

public class Jadwal {
    public String hari;
    public MataKuliah mataKuliah;
    public Ruangan ruangan;
    public Dosen dosenPengampu;

    public Jadwal(String hari, MataKuliah mataKuliah, Ruangan ruangan, Dosen dosenPengampu) {
        this.hari = hari;
        this.mataKuliah = mataKuliah;
        this.ruangan = ruangan;
        this.dosenPengampu = dosenPengampu;
    }

    public String getDetailJadwal() {
        return "Hari: " + hari + ", " + mataKuliah.getDetailMataKuliah() + ", " +
                ruangan.getDetailRuangan() + ", Dosen Pengampu: " + dosenPengampu.getDetailDosen();
    }
}
