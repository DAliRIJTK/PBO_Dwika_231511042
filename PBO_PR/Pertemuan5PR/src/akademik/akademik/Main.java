package akademik;

public class Main {
    public static void main(String[] args) {
        Mahasiswa[] mahasiswaList = {
                new Mahasiswa("Dwika", "Pekanbaru", "081234567890", "231511042", "Informatika", "Sistem Informasi"),
                new Mahasiswa("Azka", "Cimahi", "081234567891", "231511034", "Informatika", "Teknik Komputer"),
                new Mahasiswa("Radja", "Garut", "081234567892", "231511061", "Informatika", "Rekayasa Perangkat Lunak"),
                new Mahasiswa("Farhan", "Cimahi", "081234567893", "231511044", "Informatika", "Teknologi Informasi"),
                new Mahasiswa("Hanif", "Baleendah", "081234567894", "231511048", "Informatika", "Data Science"),
                new Mahasiswa("Bandy", "Semarang", "081234567895", "231511037", "Informatika", "Kecerdasan Buatan"),
                new Mahasiswa("Ahmad", "Cimahi", "081234567896", "231511033", "Informatika", "Jaringan Komputer"),
                new Mahasiswa("Ilham", "Cimahi", "081234567897", "231511053", "Informatika", "Sistem Informasi"),
                new Mahasiswa("Akmal", "Cimahi", "081234567898", "231511059", "Informatika", "Teknologi Informasi"),
                new Mahasiswa("Muammar", "", "081234567899", "231511052", "Informatika", "Teknik Komputer")
        };

        Dosen[] dosenList = {
                new Dosen("Jonner HutahaeanDidik ", "Jakarta", "081234000001", "KO018N"),
                new Dosen("Asri Maspupah", "Bandung", "081234000002", "KO067N"),
                new Dosen("Suwito Pribadi", "Surabaya", "081234000003", "KO005N"),
                new Dosen("Ida Suhartini", "Medan", "081234000004", "KO056N"),
                new Dosen("Ade Hodijah", "Palembang", "081234000005", "KO060N"),
                new Dosen("Beri N", "Yogyakarta", "081234000006", "KO068N"),
                new Dosen("Sofy Fitriani", "Bali", "081234000007", "KO077N"),
                new Dosen("Hashri Hayati", "Malang", "081234000008", "KO071N"),
                new Dosen("Irwan Setiawan", "Makassar", "081234000009", "KO045N"),
                new Dosen("Cholid Fauzi", "Semarang", "081234000010", "KO069N")
        };

        Jadwal[] jadwalList = {
                new Jadwal("Senin", new MataKuliah("Matematika Diskrit", "21IF1001"), new Ruangan("D101", "Lab. PjBL-1"), dosenList[0]),
                new Jadwal("Selasa", new MataKuliah("Struktur Data dan Algoritma", "21IF1002"), new Ruangan("D102", "Lab. RPL"), dosenList[1]),
                new Jadwal("Rabu", new MataKuliah("Pemrograman Berbasis Objek", "21IF1003"), new Ruangan("D103", "Lab. MT"), dosenList[2]),
                new Jadwal("Kamis", new MataKuliah("Dasar dasar pemmrograman", "21IF1004"), new Ruangan("D104", "Kelas"), dosenList[3]),
                new Jadwal("Jumat", new MataKuliah("Basis Data", "21IF1005"), new Ruangan("D105", "Lab. SDB"), dosenList[4])
        };

        // Menampilkan data mahasiswa
        System.out.println("\nData Mahasiswa:");
        for (Mahasiswa mhs : mahasiswaList) {
            if (mhs != null) {
                System.out.println(mhs.getDetailMahasiswa());
            }
        }

        // Menampilkan data dosen
        System.out.println("\nData Dosen:");
        for (Dosen dsn : dosenList) {
            if (dsn != null) {
                System.out.println(dsn.getDetailDosen());
            }
        }

        // Menampilkan jadwal perkuliahan
        System.out.println("\nJadwal Perkuliahan:");
        for (Jadwal jdwl : jadwalList) {
            if (jdwl != null) {
                System.out.println(jdwl.getDetailJadwal());
            }
        }
    }
}
