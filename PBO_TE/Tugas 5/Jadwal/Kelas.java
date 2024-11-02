public class Kelas {
    private String kodeKelas;
    private MataKuliah mataKuliah;
    private Dosen dosen;

    public Kelas(String kodeKelas, MataKuliah mataKuliah, Dosen dosen){
        this.kodeKelas = kodeKelas;
        this.mataKuliah = mataKuliah;
        this.dosen = dosen;
    }

    public void dataKelas () {
        System.out.println("Kode Kelas : " + kodeKelas);
        mataKuliah.dataMataKuliah();
        System.out.println("Dosen Pengajar : " + dosen.nama);
    }
}
