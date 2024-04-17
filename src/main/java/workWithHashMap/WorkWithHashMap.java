package workWithHashMap;

import java.util.HashMap;
import java.util.Map;

public class WorkWithHashMap {


    public static void main(String[] args) {
        Map<String, String> countries = new HashMap<String, String>();

        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");

        //get value by key
        countries.get("UA");

        //get key by value
        String key = "";
        for (Map.Entry <String, String> entry : countries.entrySet()) {
            if (entry.getValue().equals("Ukraine")) {
                key = entry.getKey();
                break;
            }
        }
        System.out.println(key);
    }







}
