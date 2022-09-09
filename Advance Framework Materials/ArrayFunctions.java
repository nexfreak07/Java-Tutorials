import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class ArrayFunctions {
    public static void main(String[] args) {
        Integer arr[]  = {5,2,3,4,5,6,9,7,7};


        // .length - It's an attribute
        System.out.println(arr.length);

        // Arrays.asList(arr) - convert array to arraylist
        List<Integer> list = Arrays.asList(arr);
        System.out.println("List of Array "+list);

        //binarySearch() - search in Binarysearch algo and returns the index of element - Only on sorted Arrays
        Arrays.sort(arr);
        System.out.println("Sorted Array ");
        for (Integer i : arr){
            System.out.print(i+"\t");
        }
        System.out.println("Binary Search on the array "+Arrays.binarySearch(arr, 9));

        //binarySearch(arr, key, from index , to index)
        System.out.println("Binary Search Indexed "+Arrays.binarySearch(arr,7,arr.length,7));

        int a[] = {5, 2, 3, 4, 5, 6, 9, 7, 7};
        int a1[] = {5, 2, 3, 4, 5, 6, 9, 7, 7};
        int b[] = {5, 2, 3, 9, 8, 7, 4, 0, 6};





        System.out.println("Compare(arr1, arr2) "+Arrays.compare(a,b));

        //equals() - checks if both are equal or not
        System.out.println("equals() "+Arrays.equals(a,b));
        System.out.println("equal from to index"+Arrays.equals(a,0,2,b,0,2));

        //.fill(array, value) - Filling whole array with a value
        int c [] = {0,0,0,0,0,0,0};
        Arrays.fill(c,1);
        System.out.println("Printing C "+ Arrays.toString(c));


        //Equals() -
        System.out.println("Equals() a,b "+Arrays.equals(a,b));
        System.out.println("Equals() a,a1 "+Arrays.equals(a,a1));
        System.out.println("Equals () Range "+ Arrays.equals(a,0,3,b,0,3));

        //copyOf() -
        int copy [] = Arrays.copyOf(a,a.length);
        System.out.println("Copy Array "+ Arrays.toString(copy));
        int copy2[] = Arrays.copyOfRange(a,0,3);
        System.out.println("Copy Array Range "+Arrays.toString(copy2));


        //Arrays.stream() - Returns a IntStream of Array
        IntStream stream = Arrays.stream(a);
        System.out.println("Max number of Array from stream "+stream.max());

        //equals() - This method check for the memory locations of the array
        int arr1[] = {1,2,3};
        int arr2 [] = {1,2,3};
        int arr3 [] = arr1;
        System.out.println("arr1 and arr2 equals but not same memory "+ arr1.equals(arr2));
        System.out.println("arr1 and arr3 equals but same memory "+arr1.equals(arr3));

        int arr4 [] = {1, 5, 3};
        int arr5[] = {1,2,9};
        //compare(arr1,arr2) - arr1 == arr2 ---------> 0
        // arr1 > arr2 ----------------> 1
        // arr1 < arr2 ----------------> -1
        System.out.println("compare() same array but diff loc "+Arrays.compare(arr1,arr2));
        System.out.println("compare() Completely different array "+ Arrays.compare(arr1,arr4));
        System.out.println("compare() Completely different array "+Arrays.compare(arr4,arr1));

        System.out.println("Compare () Range "+Arrays.compare(arr1,0,2,arr4,0,1));

        //Mismatch - Returns Index from where it is mismatching
        // if no mismatch returns -1
        System.out.println("mismatch() arr1 and arr4 "+Arrays.mismatch(arr1,arr4));
        System.out.println("mismatch() arr1 and arr2 "+Arrays.mismatch(arr1,arr2));
        // Range will be arr1 {1,2} and arr1 {1} --------> ans = 1
        System.out.println("mismatch() arr1 and arr4 range "+Arrays.mismatch(arr1,0,2,arr4,0,1));


        Integer d1[] = {5,2,3,4,5,6,9,7,7};
        //.deepHashCode()
        System.out.println("Deep Hash Code "+ Arrays.deepHashCode(arr));
        //.deepToString
        System.out.println("Deep To String "+Arrays.deepToString(d1));
        //Arrays.deepEquals()


        Integer d2[] = arr;
        System.out.println("Deep Equals true for same memory locations "+ Arrays.deepEquals(arr,d1));
        System.out.println("Deep Equals "+ Arrays.deepEquals(arr,d2));

        //ParallelSort
        Arrays.parallelSort(arr4);
        System.out.println("Parallel sorted arr4 "+Arrays.toString(arr4));


        //sort() - > with comparator and range
        String str [] = {"Vishal", "Akash", "Dasgupta"};
        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        System.out.println("Sorted using comparator Ascending "+Arrays.toString(str));

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareToIgnoreCase(o1);
            }
        });
        System.out.println(Arrays.toString(str));

        //Sorting on basis of 2nd Character

        Arrays.sort(str, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.charAt(1)>o2.charAt(1))
                    return 1;
                return -1;
            }
        });
        System.out.println(Arrays.toString(str));
        Comparator <Integer> com = (o1,o2) -> {
            if(o1<o2)
                return 1;
            return -1;
        };
        Arrays.parallelSort(d1,com);
        System.out.println("Parallel Sort by Comparator "+Arrays.toString(d1));

        System.out.println("Spliterating Array " +Arrays.toString(a));

        Spliterator <Integer> spliterator = Arrays.spliterator(a);
        Spliterator <Integer> s = spliterator.trySplit();

        System.out.println("First Half");
        s.forEachRemaining(System.out::print);
        System.out.println();
        System.out.println("Second Half");
        spliterator.forEachRemaining(System.out::print);

        //Parallel Set All
        int array []  = {0,1,2,3,4,5};
        IntUnaryOperator op = n-> {
          if(n%2==0)
              return n*n;
          else
            return n;
        };
        Arrays.parallelSetAll(array,op);
        System.out.println("Parallel Set Array "+Arrays.toString(array));




    }
}

