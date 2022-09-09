
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StreamFunctions {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        //For Loop
        for(int i=0; i<5; i++)
        {
            System.out.print(list.get(i)+ " ");
        }
        System.out.println();

        // Iterator
        Iterator iterator = list.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();

        // Enhanced For Loop
        for(int i : list)
            System.out.print(i+" ");
        System.out.println();

        // All loops are External Iterations - Fetch value outside

        // Internal Iterations - Method by which you can increment - Internal Iterations can be done by stream api

        list.forEach(n -> System.out.println(n)); // Lambda Expressions

    }
}
