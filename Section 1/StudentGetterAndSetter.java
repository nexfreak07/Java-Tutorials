
// It is used for data hiding and providing advanced restriction ex - setting phone no you cannot have letters you can provide via this methods
class StudentGetterAndSetter
{
    private String name;
    private String surname;
    private int age;
    // Default Constructor
    public StudentGetterAndSetter()
    {
        
    }
    //Creating Constructor Parameterized
    public StudentGetterAndSetter(String name, String surname, int age)
    {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    
    // All methods are private use getter and setter methods to get and set values
    public void setName (String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setSurname(String surname)
    {
        this.surname = surname;
    }
    public String getSurname()
    {
        return surname;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
}