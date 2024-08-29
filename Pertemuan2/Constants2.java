public class Constants2 {

    // Mendeklarasikan konstanta CM_PER_INCH dengan nilai 2.5, yang tidak dapat diubah
    public static final double CM_PER_INCH = 2.5;

    public static void main(String[] args) {

        // Mendeklarasikan variabel paperWidth dan memberikan nilai 15 inci
        double paperWidth = 15;

        // Mendeklarasikan variabel paperHeight dan memberikan nilai 25 inci
        double paperHeight = 25;

        // Mencetak ukuran kertas dalam sentimeter
        // Mengalikan paperWidth dan paperHeight dengan nilai CM_PER_INCH untuk mengonversi dari inci ke sentimeter
        System.out.println("Paper size in centimeters: " + 
            paperWidth * CM_PER_INCH +  // Menghitung lebar kertas dalam sentimeter
            " by " + 
            paperHeight * CM_PER_INCH); // Menghitung tinggi kertas dalam sentimeter

    }
}
