import java.util.*;

public class SetInterface {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(15);
        hashSet.add(21);
        hashSet.add(27);
        hashSet.add(44);
        hashSet.add(55);
        System.out.println("True as 70 is going in for first time -: "+hashSet.add(70));
        System.out.println("False as 70 is inserte 2nd time -: "+hashSet.add(70));

        System.out.println("Printing HashSet (not in the insertion order)");
        Iterator<Integer> iterator = hashSet.iterator();

        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        // Equals method checking itself
        HashSet<Integer> s  = (HashSet<Integer>) hashSet;
        System.out.println(hashSet.equals(s));

        //Clone method
        Object o =  ((HashSet<Integer>) hashSet).clone();
        System.out.println("Cloned set "+ o);

        //Contains method
        System.out.println("Checking 70 contains in hashSet or not "+ hashSet.contains(70));

        //isEmpty()
        System.out.println("Checking hashSet is empty or not "+hashSet.isEmpty());

        //size()
        System.out.println("Size of Hash Set "+hashSet.size());

        //remove()
        System.out.println("Removing 27 "+hashSet.remove(27));
        System.out.println("After removing "+hashSet);

        //Spliterator
        Spliterator<Integer> spliterator = hashSet.spliterator();
        Spliterator<Integer> spliterator1 = spliterator.trySplit();

        System.out.println("First half");
        spliterator.forEachRemaining(n -> System.out.println(n));
        System.out.println("Second Half");
        spliterator1.forEachRemaining(n -> System.out.println(n));

        //Clear
//        hashSet.clear();
//        System.out.println("Cleared hashset "+hashSet);


        // Tree Set is used for Sorted set
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> retain = new LinkedHashSet<>();
        retain.add(44);
        retain.add(27);
        treeSet.addAll(hashSet);

        Iterator iterator1 = treeSet.iterator();
        while(iterator1.hasNext())
            System.out.println("Output from TreeSet"+iterator1.next());

        treeSet.retainAll(retain);
        System.out.println("Retaind TreeSet"+treeSet);


        //Linked hashset is to maintain the insertion order
        Set<Integer> linkedset = new LinkedHashSet<>();
        linkedset.add(15);
        linkedset.add(21);
        linkedset.add(27);
        linkedset.add(44);
        linkedset.add(55);
        Iterator iterator2 = linkedset.iterator();
        while(iterator2.hasNext())
            System.out.println("Output from LinkedHashSet"+iterator2.next());


    }
}
