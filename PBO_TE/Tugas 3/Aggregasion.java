import java.util.*;

class aggregation {
    String date;
    String candy;
    int consumption;

    aggregation(String date, String candy, int consumption) {
        this.date = date;
        this.candy = candy;
        this.consumption = consumption;
    }

    public String toString() {
        StringBuffer str = new StringBuffer();
        str.append(date);
        str.append("\t\t\t\t");
        str.append(String.valueOf(candy));
        str.append("\t\t\t\t");
        str.append(String.format("%20s", String.valueOf(consumption)));
        return str.toString();
    }

    public static void main(String[] args) {
        aggregation[] cc = new aggregation[9];
        cc[0] = new aggregation("27-08-2022", "skittles", 20);
        cc[1] = new aggregation("27-08-2022", "Kitkat", 10);
        cc[2] = new aggregation("27-08-2022", "Alpenliebe", 20);
        cc[3] = new aggregation("28-08-2022", "Kitkat", 30);
        cc[4] = new aggregation("28-08-2022", "Hershey's", 25);
        cc[5] = new aggregation("29-08-2022", "Kitkat", 30);
        cc[6] = new aggregation("29-08-2022", "skittles", 15);
        cc[7] = new aggregation("29-08-2022", "Alpenliebe", 20);
        cc[8] = new aggregation("29-08-2022", "Cadbury", 45);

        // Before Aggregation
        System.out.println("Date\t\t\t\t\tCandy\t\t\t\tConsumption");
        for (int i = 0; i < cc.length; i++) {
            System.out.println(cc[i]);
        }

        System.out.println();
        System.out.println();
        System.out.println("After Aggregation");
        System.out.println();

        // After aggregation
        aggregate(cc);
    }

    public static void aggregate(aggregation[] cc) {
        // Key => Candy Column (a/c to output table) |
        // Value = Another HashMap which maps each date
        // to the amount of candies consumed on that date
        HashMap<String, HashMap<String, Integer>> map = new HashMap<>();

        // An arraylist to store unique dates
        ArrayList<String> dates = new ArrayList<>();

        // HashMap to calculate total consumption datewise
        // Key => Date | Value => Total number of
        // candies consumed on that Date
        HashMap<String, Integer> consumptionDatewise = new HashMap<>();

        // HashMap to calculate total consumption candywise
        // Key => Candy | Value => Total number of candies
        // consumed of that Candy type
        HashMap<String, Integer> consumptionCandywise = new HashMap<>();

        // Populate map HashMap
        for (int i = 0; i < cc.length; i++) {
            String date = cc[i].date;
            String candy = cc[i].candy;
            int consumption = cc[i].consumption;

            if (!map.containsKey(candy)) {
                map.put(candy, new HashMap<>());
            }

            map.get(candy).put(date, consumption);

            // Let's also populate the dates
            // arraylist simultaneously
            if (!dates.contains(date)) {
                dates.add(date);
            }

            // Let's also populate the
            // consumptionDatewise hashmap
            if (!consumptionDatewise.containsKey(date)) {
                consumptionDatewise.put(date, 0);
            }

            consumptionDatewise.put(date, consumptionDatewise.getOrDefault(date, 0) + consumption);
        }

        // We have calculated total consumption datewise.
        // Let's now calculate the total consumption
        // of each candy
        for (String candy : map.keySet()) {
            HashMap<String, Integer> candyVal = map.get(candy);
            int total = 0;
            for (String date : candyVal.keySet()) {
                total += candyVal.get(date);
            }
            consumptionCandywise.put(candy, total);
        }

        // We are done with all the necessary pre-processing.
        // Let's start printing.
        // Let's print the Header Line first
        System.out.print(String.format("%-15s", "Candy/Date"));
        for (String date : dates) {
            System.out.print(date + "\t");
        }
        System.out.println("Total");

        // Printing the rest of the table
        for (String candy : map.keySet()) {
            // System.out.printf("%-4s", candy);
            System.out.print(String.format("%-15s", candy));
            HashMap<String, Integer> candyVal = map.get(candy);
            for (int i = 0; i < dates.size(); i++) {
                if (!candyVal.containsKey(dates.get(i)))
                    System.out.print("0" + "\t\t");
                else
                    System.out.print(candyVal.get(dates.get(i)) + "\t\t");
            }

            // Finally printing the total candywise
            System.out.println(consumptionCandywise.get(candy));
        }

        // Printing the Total consumption datewise :- Last Line
        System.out.print(String.format("%-15s", "Total"));
        int total = 0;
        for (int i = 0; i < dates.size(); i++) {
            int candiesOnDate = consumptionDatewise.get(dates.get(i));
            total += candiesOnDate;
            System.out.print(candiesOnDate + "\t\t");
        }
        System.out.println(total);
    }
}
