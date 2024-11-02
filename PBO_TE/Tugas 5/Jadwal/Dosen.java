public class Dosen extends Orang{
    private String matakuliah;

    public Dosen (String nama, String matakuliah) {
        super(nama);
        this.matakuliah = matakuliah;
    }

    @Override
    public void berbicara() {
        System.out.println(nama + " sedang menjelasakan di kelas tentang" + matakuliah);
    }

    @Override
    public void mendengar() {
      System.out.println(nama + " sedang mendengarkan pertanyaan dari mahasiswa");
    }

    @Override
    public void aktivitas(){
        System.out.println(nama + " sedang menyiapkan materi untuk " + matakuliah);
    }


}
