public class MataKuliah {
    private String kodeMK;
    public String namaMataKuliah;
    private Dosen pengajar;

    public MataKuliah(String kodeMK, String namaMataKuliah, Dosen pengajar){
        this.kodeMK = kodeMK;
        this.namaMataKuliah = namaMataKuliah;
        this.pengajar = pengajar;
    }

    public String getNamaMataKuliah() {
        return namaMataKuliah;
    }

    public void dataMataKuliah(){
        System.out.println("Kode Mata Kuliah : " + kodeMK);
        System.out.println("Nama Mata Kuliah : " + namaMataKuliah);
        System.out.println("Dosen Pengampu : " + pengajar);
    }
}
