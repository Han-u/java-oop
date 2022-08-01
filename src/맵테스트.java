import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class 맵테스트 {
    public static void main(String[] args){
        HashMap<String, Object> hashMap = new HashMap<>();
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        TreeMap<String, Object> treeMap = new TreeMap<>();

        hashMap.put("B", "B-value");
        hashMap.put("A", "A-value");
        hashMap.put("D", "D-value");
        hashMap.put("C", "C-value");
        hashMap.put("B", "B-value");

        linkedHashMap.put("B", "B-value");
        linkedHashMap.put("A", "A-value");
        linkedHashMap.put("D", "D-value");
        linkedHashMap.put("C", "C-value");
        linkedHashMap.put("B", "B-value");

        treeMap.put("B", "B-value");
        treeMap.put("A", "A-value");
        treeMap.put("D", "D-value");
        treeMap.put("C", "C-value");
        treeMap.put("B", "B-value");

        System.out.println(hashMap.get("A"));

        for(String key: hashMap.keySet()){
            System.out.println(key + ": " + hashMap.get(key));
        }


    }
}
