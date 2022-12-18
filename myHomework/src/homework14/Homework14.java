package homework14;

/**
 * Java Prof. Homework #14
 *
 * @author Dzmitry Kryvialeu
 * @version 15.12 - 18.12
 */

import java.util.HashMap;
import java.util.Map;

public class Homework14 {
    public static void main(String[] args) {
        HashTable<String, String> hashTable = new HashTable<>();
        hashTable.put("Warsaw", "Poland");
        hashTable.put("Minsk", "Belarus");
        hashTable.put("Berlin", "Germany");
        System.out.println("_______");
        System.out.println(hashTable.remove("Minsk"));
        System.out.println(hashTable);
        System.out.println(hashTable.get("Minsk"));
    }

    static void before(){
        Map<String, String> map = new HashMap<>();
        map.put("Warsaw", "Poland");
        map.put("Minsk", "Belarus");
        map.put("Berlin", "Germany");
        System.out.println(map);
        System.out.println(map.get("Minsk"));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
    }
}
