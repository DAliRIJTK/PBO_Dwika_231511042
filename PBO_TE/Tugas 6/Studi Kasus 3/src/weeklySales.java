import java.util.Arrays;
import java.util.Scanner;

public class weeklySales {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan total sales: ");
        int numSalesPeople = scan.nextInt();
        scan.nextLine();

        Salesperson[] salespeople = new Salesperson[numSalesPeople];

        for (int i = 0; i < numSalesPeople; i++){
            System.out.println("Masukkan first name, last name, dan jumlah sales");
            String firstName = scan.next();
            String lastName =  scan.next();
            int totalSales = scan.nextInt();

            salespeople[i] = new Salesperson(firstName, lastName, totalSales);
        }

        Arrays.sort(salespeople);

        System.out.println("sales staff in order of sales from most to least : ");
        for (Salesperson sp : salespeople){
            System.out.println(sp);
        }
    }
}