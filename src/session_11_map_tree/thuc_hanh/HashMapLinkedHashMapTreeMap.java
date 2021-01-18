package session_11_map_tree.thuc_hanh;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapLinkedHashMapTreeMap {
    public static void main(String[] args) {
        Map<String,Integer> Hashmap = new HashMap<String, Integer>();
        Hashmap.put( "Quang" , 28);
        Hashmap.put(" Sang", 24);
        Hashmap.put("Vi", 29);
        Hashmap.put("Hoang", 26);
        System.out.println("Display entries in HashMap");
        System.out.println(Hashmap+ "\n");

        Map<String, Integer> treeMap = new TreeMap<String, Integer>(Hashmap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }

}
