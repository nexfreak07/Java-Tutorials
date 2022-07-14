class TestGetterSetter
{
    public static void main(String[] args)
    {
        // StudentGetterAndSetter.name = "Akash"; Cannot aCCESS AS pRIVATE ACCESS SPECIFIER
        
        StudentGetterAndSetter st = new StudentGetterAndSetter(); // --> Calls Default constructor
        // Setting and getting values using getter and setter methods
        
        //st.name = "Akash"; // Still cannot access as Private Access Specifier
        
        st.setName("Akash");
        st.setSurname("Dasgupta");
        st.setAge(18);
        
        String name = st.getName();
        String surname = st.getSurname();
        int age = st.getAge();
        
        System.out.println(name);
        System.out.println(surname);
        System.out.println(age);
        
        //Using Constructor
        StudentGetterAndSetter st1 = new StudentGetterAndSetter("nex", "freak", 24);// Calling Parameterized Constructor
        //Using get methods as variables are private
        System.out.println(st1.getName());
        System.out.println(st1.getSurname());
        System.out.println(st1.getAge());
        
        // Objects do not point to same memory location.
        
        if(st==st1)
        System.out.println("Same");
        else
        System.out.println("Not Same");
        
        
        // Creating or Copying  objects
        StudentGetterAndSetter st2 = new StudentGetterAndSetter();
        st2 = st1;
        System.out.println("Name from St2--> Copying from st1"+st2.getName());
    }
}