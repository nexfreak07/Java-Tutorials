import com.sun.source.tree.WhileLoopTree;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.Vector;

public class IteratorIm {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector();
        v.add(5);
        v.add(10);
        v.add(15);
        v.add(20);
        v.add(25);
        v.add(30);
        System.out.println("The vector is : "+v);
        //Initializing List Iterator
        ListIterator<Integer>  listIterator = v.listIterator();
        //Initial Pointer
        System.out.println("Initial next Pointer by nextIndex() "+listIterator.nextIndex());
        System.out.println("Has Next "+listIterator.hasNext());
        System.out.println("Has Previous "+listIterator.hasPrevious());
        System.out.println("Initial Previous Index is "+listIterator.previousIndex());
        System.out.println("First Element "+listIterator.next());
        System.out.println("Second Element "+listIterator.next());
        System.out.println("Previous Element "+listIterator.previous());

        //Special function  to add while iterating, adding 16 after 15
        listIterator.previous(); //Setting to 0

        System.out.println("Before iterator adding :"+v);
        while (listIterator.hasNext())
        {
            listIterator.next();
            listIterator.add(16);

        }
        System.out.println("After adding "+v);

        //BackTraversing
        while(listIterator.hasPrevious())
        {
            listIterator.previous();
        }

        //Special Function to remove method
        while(listIterator.hasNext())
        {
            if(listIterator.next() == 15)
                listIterator.remove();
        }
        System.out.println("Removed 15 using list iterator "+v);


        //Moving back
        while(listIterator.hasPrevious())
            listIterator.previous();

        while (listIterator.hasNext())
        {
            listIterator.next();
            if(listIterator.next().equals(20))
            {
                listIterator.previous();
               listIterator.add(15);
            }

        }
        System.out.println("After adding 15 "+v );

        //Set Method of list iterator

        //First removing all 16
        while(listIterator.hasPrevious())
            listIterator.previous();

        while (listIterator.hasNext())
        {
            listIterator.next();
            if(listIterator.next()==16)
                listIterator.remove();
        }
        System.out.println("After removing 16's "+v);

        while(listIterator.hasPrevious()) {
            listIterator.previous();

        }
        //Set operations basically replaces the last index which we called by that element
        listIterator.set(2);
        System.out.println("After set operation "+v);






    }
}
