
import java.util.*;
class ComparableDemo
{
    public static void main(String[] args) {
        List<student> s = new ArrayList<>();
        s.add(new student("Varun", 20));
        s.add(new student("Amar", 11));
        s.add(new student("Sahil", 4));
        s.add(new student("Krish", 7));
        s.add(new student("Ashish", 5));
        s.add(new student("Josh", 40));

        Collections.sort(s);

        s.forEach((n) -> print(n));

    }
    public static void print(student s)
    {
        System.out.println("Name : "+s.name+" Roll no : "+s.roll);
    }
}

//Cpmaparable is implemented inplace of sorting class itself
class student implements Comparable<student>
{
    String name;
    int roll;
    public student(String name, int roll)
    {
        this.name = name;
        this.roll = roll;
    }

    // Comparing all rollno
    @Override
    public int compareTo(student o) {
        //return this.roll > o.roll? 1: -1;   // Soring by Rollno
        return this.name.compareToIgnoreCase(o.name); // Sorting by Name
    }
}