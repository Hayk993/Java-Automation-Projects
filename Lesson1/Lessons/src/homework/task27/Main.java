package homework.task27;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        HashMap<HouseholdAppliance, List<Buyer>> map =
                new HashMap<>();

        HouseholdAppliance tv =
                new HouseholdAppliance(
                        "TV",
                        "Samsung",
                        "Q80",
                        200);

        HouseholdAppliance vacuum =
                new HouseholdAppliance(
                        "Vacuum Cleaner",
                        "LG",
                        "VC100",
                        1200);

        Buyer b1 =
                new Buyer(
                        "Hayk",
                        "Mkrtchyan",
                        "20:006:2000",
                        "Goris");

        Buyer b2 =
                new Buyer(
                        "Karen",
                        "Petrosyan",
                        "10:05:1999",
                        "Kapan");

        Buyer b3 =
                new Buyer(
                        "Anna",
                        "Hakobyan",
                        "15:05:1996",
                        "Yerevan");

        map.put(tv, new ArrayList<>());
        map.put(vacuum, new ArrayList<>());

        map.get(tv).add(b1);
        map.get(tv).add(b2);

        map.get(vacuum).add(b3);

        for (HouseholdAppliance appliance : map.keySet()) {

            System.out.println(appliance);

            for (Buyer buyer : map.get(appliance)) {
                System.out.println("   " + buyer);
            }
        }
    }
}
