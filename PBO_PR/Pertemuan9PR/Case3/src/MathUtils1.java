// ****************************************************************
// MathUtils.java
//
// Provides static mathematical utility functions.
// 
// ****************************************************************
public class MathUtils1 {
    //-------------------------------------------------------------
    // Returns the factorial of the argument given
    // Throws IllegalArgumentException if n is negative or > 16
    //-------------------------------------------------------------
    public static int factorial(int n) throws IllegalArgumentException {
        // Check for negative numbers
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers: " + n);
        }

        // Check for numbers greater than 16 (overflow prevention)
        if (n > 16) {
            throw new IllegalArgumentException("Factorial overflow: This method can't compute factorial for numbers greater than 16");
        }

        int fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }
}