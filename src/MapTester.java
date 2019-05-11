import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTester {
    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();

        map.put("Tomek", "725487910");
        map.put("Tola", "605487550");
        map.put("Tomek", "433211111");
        map.put("Ola", "433211111");

        System.out.println(map);

        Set<String> keys = map.keySet();
        System.out.println(keys);

        System.out.println(map.containsKey("Ola"));
        System.out.println(map.containsKey("Olek"));

        for (String key: keys
             ) {
            System.out.println(key + " " + map.get(key));
        }

        for (String value : map.values()){
            System.out.println(value);
        }

        System.out.println("-______________-");
        for (Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
            entry.setValue("0");
        }
        System.out.println(map);
    }
}
