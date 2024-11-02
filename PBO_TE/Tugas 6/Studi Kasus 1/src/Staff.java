public class Staff
{
    private final StaffMember[] staffList;

    //----------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //----------------------------------------------------------
    public Staff ()
    {
        staffList = new StaffMember[8]; // Increase the size of the array to 8.

        staffList[0] = new Executive ("Sam", "123 Main Line", "555-0469", "123-45-6789", 2423.07);

        staffList[1] = new Employee ("Carla", "456 Off Line", "555-0101", "987-65-4321", 1246.15);
        staffList[2] = new Employee ("Woody", "789 Off Rocker", "555-0000", "010-20-3040", 1169.23);

        staffList[3] = new Hourly ("Diane", "678 Fifth Ave.", "555-0690", "958-47-3625", 10.55);

        staffList[4] = new Volunteer ("Norm", "987 Suds Blvd.", "555-8374");
        staffList[5] = new Volunteer ("Cliff", "321 Duds Lane", "555-7282");

        //Add two commissioned employees to the staffList—make up your own names, addresses, phone numbers and social security numbers.
        // Have one of the employees earn $6.25 per hour and 20% commission.
        staffList[6] = new Commission("Dwika", "JL. Riung Damai 07", "085797759592", "4374274323", 6.25, 0.2);
        //and the other one earn $9.75 perhour and 15% commission.
        staffList[7] = new Commission("Ali", "JL. Riung Damai 01", "08573472913", "1434234532", 9.75, 0.15);

        ((Executive)staffList[0]).awardBonus (500.00);
        ((Hourly)staffList[3]).addHours (40);

        //For the first, put the hours worked at 35 and the total sales $400;
        ((Commission) staffList[6]).addHours(35);
        ((Commission) staffList[6]).addSales(400);
        //For the second, put the hours at 40 and the sales at $950.
        ((Commission) staffList[7]).addHours(40);
        ((Commission) staffList[7]).addSales(950);
    }

    //----------------------------------------------------------
    //  Pays all staff members.
    //----------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (StaffMember staffMember : staffList) {
            System.out.println(staffMember); // polymorphic

            amount = staffMember.pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("------------------------------");
        }
    }
}



