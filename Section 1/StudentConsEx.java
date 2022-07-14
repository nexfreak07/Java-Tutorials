
class StudentConsEx
{
    String name;
    String add;
    int age;
    // Creating three Constructor on basis of different parameters are constrictor over loading
    public StudentConsEx()
    {
        //Default Constructor
    }
    public StudentConsEx(String name, int age){
        this.name = name; // This keyword is to invoke or refer current object, 
        this.age = age;
    }
    public StudentConsEx(String name, String add, int age)
    {
        this.name = name;
        this.age = age;
        this.add = add;
    }
}