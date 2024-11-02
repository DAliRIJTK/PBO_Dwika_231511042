package akademik;

public class Dosen extends Person {
    public String NIP;

    public Dosen(String nama, String alamat, String telepon, String NIP) {
        super(nama, alamat, telepon);
        this.NIP = NIP;
    }

    public String getDetailDosen() {
        return super.getDetail() + ", NIP: " + NIP;
    }
}
