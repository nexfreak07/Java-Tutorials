import java.util.*;
import java.util.function.Consumer;

public class SplitIteratorIm {
    public static void main(String[] args) {
        Vector <user> v = new Vector<user>();
        v.add(new user("Akash",22));
        v.add(new user("Vivek",21));
        v.add(new user("Zorro",5));
        v.add(new user("Shree",22));
        v.add(new user("Adnan",22));
        v.add(new user("Shivam", 22));



        Spliterator <user> spliterator = v.spliterator();
        spliterator.forEachRemaining((n) -> print(n));


        //Splitting using spliterator
        Spliterator<user> sp = v.spliterator(); // Second Half
        Spliterator<user> sp1 = sp.trySplit(); // First Half

        System.out.println("getExactSizeIfKnown "+sp.getExactSizeIfKnown());
        System.out.println("Estimate size "+sp.estimateSize());
        System.out.println("Set of Characteristics"+ (sp.characteristics()));

        //.hasCharacteristics
        if(sp.hasCharacteristics(sp.ORDERED))
            System.out.println("Ordered");
        if(sp.hasCharacteristics(sp.DISTINCT))
            System.out.println("Distinct");
        if(sp.hasCharacteristics(sp.SIZED))
            System.out.println("Sized");
        if(sp.hasCharacteristics(sp.SUBSIZED))
            System.out.println("Subsized");
        if(sp.hasCharacteristics(sp.SORTED))
            System.out.println("Sorted");


            System.out.println("First Half");
        sp1.forEachRemaining(n -> print(n));
        System.out.println("Second Half");
        sp.forEachRemaining(n -> print(n));

        //TryAdvance
        List<Integer> list = Arrays.asList(15,14,25,33,66);
        Spliterator<Integer> split = list.spliterator();
        System.out.println("Try Advance Method prints on specified actions");
        while (split.tryAdvance(n -> System.out.println("Number : "+ n)));
        


    }
    public static void print(user u)
    {
        System.out.println("Name is "+u.name+"Age is "+u.age);
    }



}

class user
{
    String name;
    int age;
    public user(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
}

