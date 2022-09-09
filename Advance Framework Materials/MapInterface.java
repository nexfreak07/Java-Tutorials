import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        //Student name and Roll no
        Map<Integer, String> map = new HashMap<>();
        // .put()
        map.put(1,"Akash");
        map.put(2,"Vivek");
        map.put(3,"Shivam");
        map.put(4,"Zoro");
        map.put(5,"Rushi");
        map.put(6,"Honey");
        System.out.println("Map is "+map);

        // .putIfAbsent()
        System.out.println("Put if absent will give false at key 2 as it is present "+map.putIfAbsent(2,"Dasgupta"));

        // .putAll
        Map<Integer, String> putall = new HashMap<>();
        putall.put(0,"God");
        putall.put(7,"Sosne");
        map.putAll(putall);
        System.out.println("Put All"+ map);

        //V remove(Object) - Delete the entry and print
        System.out.println("remove() will print value - "+map.remove(0));

        // boolean remove(K,V) - It will not print
        System.out.println("remove(K,V) - It will not print "+map.remove(7,"Sosne"));

        //Set keySet() - Returns set of all keys - You can store into a set - used for iterations
        Set<Integer> keys = map.keySet();
        System.out.println("Key set is "+keys);

        //EntrySet Set<Map.Entry<K,V>> entrySet() - returns set view of all keys and values
        System.out.println("entrySet in map "+map.entrySet());

        //.containsKey()
        System.out.println("Contains Key 7 "+map.containsKey(7));

        //.containsValue()
        System.out.println("Contains Value Vivek "+map.containsValue("Vivek"));

        //.equals(Object) - Object is basically a map object
        System.out.println("Equals putall object "+ map.equals(putall));

        //values() - returns Collection view of values - Collecton Type
        System.out.println("Values "+map.values());

        //size
        System.out.println("Size is "+map.size());

        //getOrDefault - if key is present, gives the value, if not returns default value
        System.out.println("Get or Default - Get "+map.getOrDefault(1,"No Value such"));
        System.out.println("Get or Defaukt - Default "+map.getOrDefault(10,"No Such Value"));

        //compute(key, bifunction) - It computes and creates a new value if exist or null if don't
        map.compute(2,(k,v) -> v+" Nirmal "+k*2);
        System.out.println("After Computing "+map.get(2));

        //computeIfAbsent takes only a function which is key and present takes both key,value
        map.computeIfAbsent(0, (k)-> k + "Akash");
        map.computeIfPresent(1, (k,v) -> v + " Dasgupta "+ k);
        System.out.println("Map After Updation Compute "+map);

        //replace(key, old Value, new Value)
        map.replace(3,"Shivam","Aman");
        System.out.println("Index 3 replaced by entering old and new value "+ map);

        //replace(key, value)
        map.replace(3,"Mulani");
        System.out.println("Index 3 replaced by entering only new value "+map);

        //replaceAll(BiFunction)
        map.replaceAll((key,value) -> value + " UST ");
        System.out.println("Map After Replace All "+map);

        //Collection values()

        Object values = map.values();
        System.out.println("Collection values() - Collection Views of values "+values);

        //merge(new key, new value, Bifunction)
        // The bifunction of merge will only work if the key given is already in map,
        //If key is not in map then it just will be added or merged
        String returnedVal = map.merge(8, "Megha", (k,v) -> v + "BlueConch" );
        System.out.println("Returned Value "+returnedVal);
        System.out.println("After merge "+map);

        Map<Integer, String> treemap = new TreeMap<>();
        treemap.putAll(map);

        System.out.println("Tree map "+map);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"Akash");
        linkedHashMap.put(2,"Vivek");
        linkedHashMap.put(3,"Shivam");
        linkedHashMap.put(4,"Zoro");
        linkedHashMap.put(5,"Rushi");
        linkedHashMap.put(6,"Honey");
        System.out.println("Linked HashMap "+linkedHashMap);

        String k = linkedHashMap.toString();
        System.out.println("To string Map "+k);

        int size = map.size();
        System.out.println("Size of Map "+size);




    }
}
