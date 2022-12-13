import java.util.HashMap;
import java.util.Map.Entry;
public class Main4 {
    public static void main(String[] args) {
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);


        System.out.println(capitalCities.get("USA"));

        System.out.println(capitalCities.containsKey("USA"));
        System.out.println(capitalCities.containsValue("Oslo"));

        capitalCities.putIfAbsent("Ukraine","Kyiv");

        System.out.println(capitalCities);


        System.out.println(capitalCities.values());

        System.out.println(capitalCities.size());



        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        System.out.println(capitalCities.entrySet());
        String value = "Oslo";

        for(Entry<String, String> entry: capitalCities.entrySet()) {

            if(entry.getValue() == value) {
                System.out.println("The key for value " + value + " is " + entry.getKey());
                break;
            }
        }


        capitalCities.clear();
        System.out.println(capitalCities);

    }
}
