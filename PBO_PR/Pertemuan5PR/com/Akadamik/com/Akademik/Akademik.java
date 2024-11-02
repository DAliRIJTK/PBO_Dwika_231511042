package com.Akademik;

public class Akademik {
    // Class Person
    class Person {
        String nama;
        String alamat;
        String no_hp;

        public Person(String nama, String alamat, String no_hp) {
            this.nama = nama;
            this.alamat = alamat;
            this.no_hp = no_hp;
        }

        public void displayInfo() {
            System.out.println("Nama: " + nama);
            System.out.println("Alamat: " + alamat);
            System.out.println("No HP: " + no_hp);
        }
    }

    // Class Mahasiswa
    class Mahasiswa extends Person {
        String nim;
        String jurusan;
        String angkatan;

        public Mahasiswa(String nama, String alamat, String no_hp, String nim, String jurusan, String angkatan) {
            super(nama, alamat, no_hp);
            this.nim = nim;
            this.jurusan = jurusan;
            this.angkatan = angkatan;
        }

        public void displayMahasiswa() {
            displayInfo();
            System.out.println("NIM: " + nim);
            System.out.println("Jurusan: " + jurusan);
            System.out.println("Angkatan: " + angkatan);
        }
    }

    // Class Dosen
    class Dosen extends Person {
        String nip;
        String bidang_keahlian;
        String fakultas;

        public Dosen(String nama, String alamat, String no_hp, String nip, String bidang_keahlian, String fakultas) {
            super(nama, alamat, no_hp);
            this.nip = nip;
            this.bidang_keahlian = bidang_keahlian;
            this.fakultas = fakultas;
        }

        public void displayDosen() {
            displayInfo();
            System.out.println("NIP: " + nip);
            System.out.println("Bidang Keahlian: " + bidang_keahlian);
            System.out.println("Fakultas: " + fakultas);
        }
    }

    // Class Ruangan
    class Ruangan {
        String kode_ruangan;
        int kapasitas;
        String lokasi;

        public Ruangan(String kode_ruangan, int kapasitas, String lokasi) {
            this.kode_ruangan = kode_ruangan;
            this.kapasitas = kapasitas;
            this.lokasi = lokasi;
        }

        public void displayRuangan() {
            System.out.println("Kode Ruangan: " + kode_ruangan);
            System.out.println("Kapasitas: " + kapasitas);
            System.out.println("Lokasi: " + lokasi);
        }
    }

    // Class Jadwal
    class Jadwal {
        String hari;
        String mata_kuliah;
        Ruangan ruangan;
        Dosen dosen_pengampu;

        public Jadwal(String hari, String mata_kuliah, Ruangan ruangan, Dosen dosen_pengampu) {
            this.hari = hari;
            this.mata_kuliah = mata_kuliah;
            this.ruangan = ruangan;
            this.dosen_pengampu = dosen_pengampu;
        }

        public void displayJadwal() {
            System.out.println("Hari: " + hari);
            System.out.println("Mata Kuliah: " + mata_kuliah);
            System.out.println("Ruangan: ");
            ruangan.displayRuangan();
            System.out.println("Dosen Pengampu: " + dosen_pengampu.nama);
        }
    }

    // Class KelasMahasiswa
    class KelasMahasiswa {
        String nama_kelas;
        Ruangan ruangan;
        Dosen dosen_wali;
        Mahasiswa[] mahasiswaList;
        Jadwal[] jadwalList;

        public KelasMahasiswa(String nama_kelas, Ruangan ruangan, Dosen dosen_wali, Mahasiswa[] mahasiswaList, Jadwal[] jadwalList) {
            this.nama_kelas = nama_kelas;
            this.ruangan = ruangan;
            this.dosen_wali = dosen_wali;
            this.mahasiswaList = mahasiswaList;

            // Validasi bahwa setiap jadwal harus menggunakan ruangan yang sama dengan kelas
            for (Jadwal jadwal : jadwalList) {
                if (jadwal != null && jadwal.ruangan != this.ruangan) {
                    System.out.println("Error: Ruangan untuk jadwal " + jadwal.mata_kuliah + " tidak sesuai dengan ruangan kelas " + nama_kelas);
                    return; // Stop jika ada kesalahan
                }
            }
            this.jadwalList = jadwalList;
        }

        public void displayKelas() {
            System.out.println("Nama Kelas: " + nama_kelas);
            System.out.println("Ruangan: ");
            ruangan.displayRuangan();
            System.out.println("Dosen Wali: " + dosen_wali.nama);
            System.out.println("Daftar Mahasiswa: ");
            for (Mahasiswa mhs : mahasiswaList) {
                if (mhs != null) {
                    mhs.displayMahasiswa();
                    System.out.println();
                }
            }
            System.out.println("Jadwal Perkuliahan: ");
            for (Jadwal jdl : jadwalList) {
                if (jdl != null) {
                    jdl.displayJadwal();
                    System.out.println();
                }
            }
        }
    }

    // Main Program
    public class AkademikApp {
        public static void main(String[] args) {
            // Data Ruangan
            Ruangan[] ruanganList = new Ruangan[5];
            ruanganList[0] = new Ruangan("101", 40, "Gedung A");
            ruanganList[1] = new Ruangan("102", 50, "Gedung B");
            ruanganList[2] = new Ruangan("103", 30, "Gedung C");
            ruanganList[3] = new Ruangan("104", 25, "Gedung D");
            ruanganList[4] = new Ruangan("105", 35, "Gedung E");

            // Data Dosen
            Dosen[] dosenList = new Dosen[10];
            dosenList[0] = new Dosen("Dr. Budi", "Jl. Kebangsaan", "081987654321", "987654", "Pemrograman", "Teknik");
            dosenList[1] = new Dosen("Prof. Siti", "Jl. Pancasila", "081234567890", "987655", "Matematika", "Sains");
            dosenList[2] = new Dosen("Dr. Agus", "Jl. Merdeka", "081345678901", "987656", "Fisika", "Sains");
            dosenList[3] = new Dosen("Dr. Nina", "Jl. Cendrawasih", "081456789012", "987657", "Kimia", "Sains");
            dosenList[4] = new Dosen("Prof. Rudi", "Jl. Garuda", "081567890123", "987658", "Ekonomi", "Ekonomi");
            dosenList[5] = new Dosen("Dr. Lisa", "Jl. Kencana", "081678901234", "987659", "Hukum", "Hukum");
            dosenList[6] = new Dosen("Prof. Joko", "Jl. Sudirman", "081789012345", "987660", "Teknik", "Teknik");
            dosenList[7] = new Dosen("Dr. Maya", "Jl. Melati", "081890123456", "987661", "Desain", "Desain");
            dosenList[8] = new Dosen("Prof. Beni", "Jl. Anggrek", "081901234567", "987662", "Sosial", "Sosial");
            dosenList[9] = new Dosen("Dr. Tini", "Jl. Tulip", "081012345678", "987663", "Sejarah", "Sejarah");

            // Data Mahasiswa
            Mahasiswa[] mahasiswaList = new Mahasiswa[10];
            mahasiswaList[0] = new Mahasiswa("Ali", "Jl. Merdeka", "081234567890", "123456", "Informatika", "2021");
            mahasiswaList[1] = new Mahasiswa("Siti", "Jl. Sukarno", "081345678901", "123457", "Ekonomi", "2020");
            mahasiswaList[2] = new Mahasiswa("Budi", "Jl. Sudirman", "081456789012", "123458", "Desain", "2021");
            mahasiswaList[3] = new Mahasiswa("Joko", "Jl. Cendrawasih", "081567890123", "123459", "Hukum", "2022");
            mahasiswaList[4] = new Mahasiswa("Dewi", "Jl. Garuda", "081678901234", "123460", "Kimia", "2021");
            mahasiswaList[5] = new Mahasiswa("Rina", "Jl. Melati", "081789012345", "123461", "Fisika", "2020");
            mahasiswaList[6] = new Mahasiswa("Maya", "Jl. Anggrek", "081890123456", "123462", "Teknik", "2022; mahasiswaList[7] = new Mahasiswa("Rudi", "Jl. Kebangsaan", "081901234567", "123463", "Hukum", "2021");
            mahasiswaList[8] = new Mahasiswa("Siti", "Jl. Pancasila", "081012345678", "123464", "Desain", "2020");
            mahasiswaList[9] = new Mahasiswa("Agus", "Jl. Melati", "081123456789", "123465", "Ekonomi", "2022");

            // Data Jadwal
            Jadwal[] jadwalList = new Jadwal[5];
            jadwalList[0] = new Jadwal("Senin", "Pemrograman Dasar", ruanganList[0], dosenList[0]);
            jadwalList[1] = new Jadwal("Selasa", "Matematika", ruanganList[1], dosenList[1]);
            jadwalList[2] = new Jadwal("Rabu", "Fisika", ruanganList[2], dosenList[2]);
            jadwalList[3] = new Jadwal("Kamis", "Kimia", ruanganList[3], dosenList[3]);
            jadwalList[4] = new Jadwal("Jumat", "Ekonomi", ruanganList[4], dosenList[4]);

            // Data Kelas Mahasiswa
            Mahasiswa[] kelasMahasiswaList = new Mahasiswa[10];
            System.arraycopy(mahasiswaList, 0, kelasMahasiswaList, 0, mahasiswaList.length);

            KelasMahasiswa kelas = new KelasMahasiswa("Teknik Informatika 2021", ruanganList[0], dosenList[0], kelasMahasiswaList, jadwalList);

            // Tampilkan data
            kelas.displayKelas();
        }
    }


}
