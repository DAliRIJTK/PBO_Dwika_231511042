public class Constants2 {

    // Mendeklarasikan konstanta CM_PER_INCH,dengan nilan yang tidak dapat diubah
    public static final double CM_PER_INCH = 2.5;

    public static void main(String[] args) {

        // Mendeklarasikan variabel paperWidth
        double paperWidth = 15;

        // Mendeklarasikan variabel paperHeight
        double paperHeight = 25;

        System.out.println("Paper size in centimeters: " + 
            paperWidth * CM_PER_INCH +  // Menghitung lebar kertas dalam sentimeter
            " by " + 
            paperHeight * CM_PER_INCH); // Menghitung tinggi kertas dalam sentimeter
    }
}
