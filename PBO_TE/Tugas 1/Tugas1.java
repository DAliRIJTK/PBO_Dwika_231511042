import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args){
        int Ntgs, Nuts, Neas;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nilai Tugas: ");
        Ntgs = scanner.nextInt();

        System.out.print("Masukkan Nilai UTS: ");
        Nuts = scanner.nextInt();

        System.out.print("Masukkan Nilai EAS: ");
        Neas = scanner.nextInt();

        double NAkhir = (0.2 * Ntgs) + (0.35 * Nuts) + (0.45 * Neas);

        String N = (NAkhir >= 80) ? "A" : (NAkhir >= 75) ? "B" : (NAkhir >= 65) ? "C" : (NAkhir >= 50) ? "D" : "E";

        System.out.println("Nilai Tugas Anda: " + Ntgs);
        System.out.println("Nilai UTS Anda: " + Nuts);
        System.out.println("Nilai EAS Anda: " + Neas);
        System.out.println("Nilai Akhir Anda: " + NAkhir);
        System.out.println("Nilai Indeks Anda : " + N);

        scanner.close();
    }
}
