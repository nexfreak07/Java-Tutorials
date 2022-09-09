import java.util.*;

class VectorFunctions {
    public static void main(String[] args) {

        System.out.println("Creating Vector");
        Vector v = new Vector(5); //5 is initial size of vector, if not given then will take default 10
        //Printing size and capacity
        System.out.println("Capacity : "+v.capacity());
        System.out.println("Size : "+ v.size());

        //Adding elements
        v.add(1);
        v.add(2);
        //Printing added elements
        System.out.println(v);

        //Adding elements at index
        v.add(0,0);
        //Printing added elements
        System.out.println("Element added at index : "+v);

        //New Collection to pass into functions
        Vector<Integer> v1 = new Vector<>();
        v1.add(4);
        v1.add(5);
        v.addAll(v1);

        //Printing added elements
        System.out.println("Collection elements are :"+v1);
        System.out.println("Added collection elements :"+v);

        //Clearing v1
        v1.clear();
        System.out.println("v1 after clearing"+v1);
        v1.add(-1);
        v1.add(-2);
        v1.add(-3);
        v1.add(-4);
        v1.add(-5);

        //Adding collection v1 at an index of v
        System.out.println("v1 after new adding elements"+v1);

        v.add("Akash"); //Adding an object to use  .remove(Object)
        v.addAll(0,v1);
        System.out.println("Collection added from index 0"+v);

        //Removal of elements 1st occurence object
        v.remove("Akash");
        System.out.println("After removing object Akash :"+v);

        //Removal of elements 1st occurence index, removing 2nd index that is -3
        v.remove(2);
        System.out.println("After removing -3 that is 2nd index :"+v);

        //Removing element using index different function, 0th index effected that is -1
        v.removeElementAt(0);
        System.out.println("After removing element at index : "+v);

        //Removing element using object different func, will take 1st occurence
        v.add("UST");
        v.add("Blue");
        v.add("UST");
        System.out.println("After added some "+v);
        v.removeElement("UST");
        System.out.println("After Removal of object using diff func: "+v);

        //Removing all from v based on v1 collection, removing 1 and 2 at one time
        v1.clear();
        v1.add(1);
        v1.add(2);
        v.removeAll(v1);
        System.out.println("After removing elements based on v1 that is 1 and 2"+v);

        //Removing all elements
        System.out.println("Vectore before removing all "+v1 );
        v1.removeAllElements();
        System.out.println("Vector after removing all elements " +v1);

        //Removing if
        v1.add(1);
        v1.add(2);
        v1.add(3);
        v1.add(4);
        v1.add(5);
        v1.add(6);
        v1.add(7);
        v1.add(8);
        System.out.println("Vector before removing if "+v1);
        v1.removeIf((n) -> (n % 2==0));
        System.out.println("Vector after removing if "+ v1);

        //Cloning Object
        Object o = v1.clone();
        System.out.println("Cloned object : o is "+o);

        //contains()
        System.out.println("Contains func checking contains 3 in v1 :"+v1.contains(3));

        //containsAll()
        System.out.println("Checking v1 all elements contains in v or not "+v.containsAll(v1));

        //elementAt(index) - returns element at that index
        System.out.println("Returning element at index 0"+v.elementAt(0));

        //.elements() - Returns enumration of components of vector
        //You have to use Enumration Interface and then initialize the function
        Enumeration e = v.elements();
            while (e.hasMoreElements())
            {
                System.out.println("Printing by enumration : "+e.nextElement());
            }

        //Creating new vector for ensure Capacity --- Increases the capacity
            Vector<Integer> v2 = new Vector<>(5);
        System.out.println("Capacity of v2 "+v2.capacity());
        v2.add(11);
        v2.add(12);
        v2.add(13);
        v2.add(14);
        v2.add(15);
        v2.add(16);
        v2.add(11);
        v2.ensureCapacity(40);
        System.out.println("The current vector v2 is "+v2);
        System.out.println("After ensure Capacity " + v2.capacity());

        //.equals() -- Checks if two objects are equal or not
        System.out.println("Result of v2.equals(v1) "+ v2.equals(v1));

        //Returns First element .firstElement()
        System.out.println("Returns First element .firstElement() "+v2.firstElement());

        //for each loop in one line
        v2.forEach(n -> System.out.println("Printing using Lambda Func "+n));

        //.get() - Retrive the element at that index
        System.out.println("Get Function by index "+v2.get(1));

        //.hashCode() - Returns hashcode
        System.out.println("Hashcode is "+v2.hashCode());

        //.indexOf(Object) - Getting index by passing object 1st occurence - IF that object is not present returns -1
        System.out.println("Printing the object vector "+v);
        System.out.println(".indexOf(Object) - Getting index by passing object "+v.indexOf("UST"));

        //.indexOf(Object, index) - Return the objects index, searching after that index
        v.add(-2);
        v.add(-1);
        System.out.println("V after Added elements "+v);
        System.out.println("V after the .indexOf Operation searching for -2 after index 3 "+  v.indexOf(-2,3));

        //.isEmpty()
        System.out.println("Checking vector v is empty or not "+v.isEmpty());

        //.lastElement()
        System.out.println("Getting last element 1st occurence "+v.lastElement());

        //.lastElement(Object)
        System.out.println("Getting last elemnt index 1st occurence by object "+v.lastIndexOf(-2));

        //.lastElement(Object, index) - for o = -2 and ind = 7 -->> 0 searches elements before 7
        System.out.println("Getting last elemnt index 1st occurence by object and by searching before given index"+v.lastIndexOf(-2,7));

        //Iterator - Travels only forward / Cannot add/replace while traversing / used for LIST SET MAP
        System.out.println("Printing by iterator");
        Iterator iterator = v.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        //List Iterator - Travels F/w and B/w
        System.out.println("Forward by List Iterator");
        ListIterator listIterator = v.listIterator();
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }

        System.out.println("Index by list iterator of last index (Feature)"+listIterator.nextIndex());
        System.out.println("Backward by list Iterator");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println("Printing Vector "+v);



        //ListIterator by Index - Giving the cursor location
        ListIterator listIterator1 = v.listIterator(5);
        System.out.println("Backward");
        while(listIterator1.hasNext())
            System.out.println(listIterator1.next());

        //Replace all function
        System.out.println("Vector v1 is "+v1);
        Collections.replaceAll(v1,3,12);
        System.out.println("Replaces vector by collections.replaceall is "+v1);

        //Retain All method - Retains all elements which are in v2
        System.out.println("V2 vector is "+v2);
        v2.retainAll(v1);
        System.out.println("After retaining "+v2);

        //Set Size method
        v2.setSize(5);
        //Set Method to set the element at an index
        v2.set(0,11);
        v2.set(3,13);
        System.out.println("V2 after set "+v2);

        //SetElementAt method
        v2.setElementAt(14,4);
        System.out.println("v2 After setElemntAt() "+v2);

        // SORT -VERY IMP
        //Without Comparator
        Vector <Integer> v3 = new Vector<>(20);
        v3.add(2);
        v3.add(74);
        v3.add(22);
        v3.add(9);
        v3.add(1);
        v3.add(6);
        v3.add(2);
        v3.add(5);

        System.out.println("Unsorted V3 "+v3 );

        Collections.sort(v3);
        System.out.println("Sorying without comparator "+v3);

        //Split Iterator
        //A seperate class file is present for split iterator

        //SubList - Returns a portion of list
        System.out.println("Sublist method on v3 "+v3.subList(0,5));

        //to Array() -Converts to Array
        Object arr[] = v3.toArray();
        System.out.println("to.Array() ");
        for (Object i :arr) {
            System.out.println(i);
        }
        // .toArray(T [] a) ---> Returns to specified array
        System.out.println(".toArray(T [] a) ---> Returns to specified array");
        Integer [] a = new Integer[8];
        a = v3.toArray(a);
        for(int i : a)
            System.out.println(i);

        //to String()
        System.out.println("to String() "+v3.toString());

        //Trim to Size
        System.out.println("Capacity of Vector v3 "+v3.capacity());
        System.out.println("Size of Vector v3 "+v3.size());

        System.out.println("Trimming to size");
        v3.trimToSize();
        System.out.println("Capacity agter trimming "+ v3.capacity());





    }
    }
