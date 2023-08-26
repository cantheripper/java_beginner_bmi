import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer,String> hashmap = new HashMap<>();
        hashmap.put(3,"Java");
        hashmap.put(31,"Python");
        hashmap.put(50,"Php");
        hashmap.put(50,"Can");
        hashmap.put(20,"Php");
        System.out.println(hashmap);
        System.out.println(hashmap.get(31));
        for (Map.Entry<Integer,String> entry: hashmap.entrySet()){
            System.out.println("Key Value: "+ entry.getKey() + "-----> Değer: "+ entry.getValue());
        }

    }
}