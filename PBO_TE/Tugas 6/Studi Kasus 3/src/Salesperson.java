public class Salesperson implements Comparable<Salesperson> {
    private String firstName, lastName;
    private int totalSales;

    public Salesperson(String First, String Last, int sales){
        firstName = First;
        lastName = Last;
        totalSales = sales;
    }

    public String toString(){
        return lastName + ", " + lastName + ": " + totalSales;
    }

    public int compareTo(Salesperson other){
        if (this.totalSales != other.totalSales){
            return  other.totalSales - this.totalSales;
        } else {
            return other.lastName.compareTo(this.lastName);
        }
    }
}
