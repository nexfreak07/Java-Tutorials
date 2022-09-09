import java.util.*;
class ComparatorDemo
{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(252);
        list.add(859);
        list.add(784);
        list.add(256);
        list.add(101);
        list.add(212);

        System.out.println("List is : "+list);
        Collections.reverse(list);
        System.out.println("Reversed list "+ list);
        Collections.sort(list);
        System.out.println("Sorted List : "+list);

        Comparator<Integer> c = new comp();
        Collections.sort(list, c);

        System.out.println("List sorted by by mid element : "+list);


        List<Employee> UST = new ArrayList<>();
        UST.add(new Employee("Akash",121));
        UST.add(new Employee("Adnan", 101));
        UST.add(new Employee("Palash", 100));
        UST.add(new Employee("Aman", 305));
        UST.add(new Employee("Dino", 31));
        UST.add(new Employee("Shub", 23)); // Never keep 027, 031 etc they are treated as octal
        UST.add(new Employee("Rahul", 127));


        // Sorting by ID
        Collections.sort(UST, (e1,e2) -> {
            return e1.id > e2.id ? 1 : -1;
        });

        UST.forEach((n) -> print(n));

        //Sorting by name
       Collections.sort(UST, new Comparator<Employee>() {
           @Override
           public int compare(Employee o1, Employee o2) {
               return o1.name.compareToIgnoreCase(o2.name); // For Comparing on strings just return compareToIgnoreCase
           }
       });

        System.out.println("Sorted by name :");
        UST.forEach((n) -> print(n));

    }
    public static void print(Employee e)
    {
        System.out.println("Name : "+ e.name+ " ID : "+e.id);
    }

}
class comp implements Comparator<Integer>
{

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1%100 > o2%100)
            return 1;
        return -1;
    }
}

class Employee
{
    String name;
    int id;
    public Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

}