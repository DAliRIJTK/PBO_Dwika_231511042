public class PaintThings {
    public static void main(String[] args) {
        Paint paint = new Paint(350); // 350 square feet per gallon

        // Create shapes
        Shape deck = new Rectangle(20, 35);
        Shape bigBall = new Sphere(15);
        Shape tank = new Cylinder(10, 30);

        // Compute amount of paint needed
        double deckAmount = paint.amount(deck);
        double ballAmount = paint.amount(bigBall);
        double tankAmount = paint.amount(tank);

        // Print results
        System.out.printf("Paint required for deck: %.2f gallons\n", deckAmount);
        System.out.printf("Paint required for big ball: %.2f gallons\n", ballAmount);
        System.out.printf("Paint required for tank: %.2f gallons\n", tankAmount);
    }
}
