public class Constants {
    public static void main(String[] args) {

        // Mendeklarasikan konstanta CM_PER_INCH dengan nilai 2.5
        final double CM_PER_INCH = 2.5;

        // Mendeklarasikan variabel paperWidth dan memberikan nilai 10
        double paperWidth = 10;

        // Mendeklarasikan variabel paperHeight dan memberikan nilai 20
        double paperHeight = 20;

        // Mencetak ukuran kertas dalam sentimeter dengan mengalikan paperWidth dan paperHeight
        // dengan nilai konstanta CM_PER_INCH dari kelas Constants2
        System.out.println("Paper size in centimeters: " +
            paperWidth * Constants2.CM_PER_INCH +  // Menghitung lebar kertas dalam sentimeter
            " by " + 
            paperHeight * Constants2.CM_PER_INCH); // Menghitung tinggi kertas dalam sentimeter
    }
}

//*output kedua nya akan berbeda jika nilainya berbeda kecuali menggunakan nilai dari public static final double pada COnstants2 maka outpunya akan sama  */
//* pada Constants ini menggunakan CM_PER_INCH menggunakan final double sehingga hanya mencakup pada terbatas yaitu pada main*/
//* Juga dengan menggunakan Constants2.CM_PER_INCH maka akan dapat digunakann karena pada Constants2.java menggunakan public static final double yang artinya dapat digunakan di program lain   */