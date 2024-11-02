public abstract class Orang {
    protected String nama;

    public Orang(String nama){
        this.nama = nama;
    }

    public abstract void berbicara();
    public abstract void mendengar();
    public abstract void aktivitas();

    public void namaOrang(){
        System.out.println("Nama : " + nama);
    }
}
