import java.util.*;
public class GenericsDemo  {
    public static void main(String[] args) {
        Container<String> name = new Container<>();
        name.value = "10";
        name.show();

        //Generics always works with wrapper classes, we cannot use any primitives it will give error
        ArrayOpn<Integer> arr = new ArrayOpn<>();
        Integer a [] = {10, 5, 7, 8,9 ,8 ,5 };
        arr.print(a);

        ArrayOpn<String> arr1 = new ArrayOpn<>();
        String a1 [] = {"Akash","Ashok", "Dasgupta"};
        arr.print(a1);

//        ArrayOpn<int> arr2 = new ArrayOpn<>();
//        int a2 [] = {10, 5, 7, 8,9 ,8 ,5 };
//        arr.print(a2);
//        The above code will give error

        //Directely calling by class name as it is static method
        ArrayOpn.print(a);

        String k ="";
        System.out.println(k.getClass().getName()); //Will get string class and will filter the class string to
        // only string

        //Limitation to numbers only
        Demo<String> dem = new Demo<>();
        dem.number = "true";
        dem.show();

        GenericsDemo g = new GenericsDemo();
        ArrayList<Number> obj = new ArrayList<>();
        obj.add(10);
        obj.add(55);
        obj.add(11);
        g.arlistprint(obj);
    }
    public  void  arlistprint(ArrayList<? super Integer> obj)
    {
        for(Object i : obj)
            System.out.println(i);
    }
}

class Container <T>{ //Defining Generics in class
        T value; //Generics
    public void show(){
        System.out.println(value.getClass().getName());
    }

}

class ArrayOpn <E> //You can give any element you want
{
    public static  <E> void print(E [] arr)
    {
        for(E i : arr)
        {
            System.out.println(i);
        }

    }
}

class Demo <T extends String>
{
    T number;
    public  <T>void show()
    {
        System.out.println(number.getClass().getName());
    }
}