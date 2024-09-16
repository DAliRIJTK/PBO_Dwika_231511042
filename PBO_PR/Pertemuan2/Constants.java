public class Constants {
    public static void main(String[] args) {

        // Mendeklarasikan konstanta CM_PER_INCH
        final double CM_PER_INCH = 2.5;

        // Mendeklarasikan variabel paperWidth
        double paperWidth = 10;

        // Mendeklarasikan variabel paperHeight
        double paperHeight = 20;

    
        System.out.println("Paper size in centimeters: " +
            paperWidth * Constants2.CM_PER_INCH +  // Menghitung lebar kertas dalam sentimeter
            " by " + 
            paperHeight * Constants2.CM_PER_INCH); // Menghitung tinggi kertas dalam sentimeter
    }
}

//*output kedua nya akan berbeda jika nilainya berbeda kecuali menggunakan nilai dari public static final double pada COnstants2 maka outpunya akan sama  */
//* pada Constants ini menggunakan CM_PER_INCH menggunakan final double sehingga hanya mencakup pada terbatas yaitu pada main*/
//* Juga dengan menggunakan Constants2.CM_PER_INCH maka akan dapat digunakann karena pada Constants2.java menggunakan public static final double yang artinya dapat digunakan di program lain   */