package akademik;

public class civitasAkademik {
    protected String nama;
    protected String alamat;
    protected String telepon;

    public civitasAkademik (String nama, String alamat, String telepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.telepon = telepon;
    }

    public String getDetail() {
        return "Nama: " + nama + ", Alamat: " + alamat + ", Telepon: " + telepon;
    }
}

