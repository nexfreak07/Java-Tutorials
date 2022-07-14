class TestCons
{
    public static void main(String[] args)
    {
        // Below Code will give error as all are non static variables in class student, if want to access make it static 
        //StudentConsEx.name = "Akash";
        //StudentConsEx.add = "BG Lane";
        //StudentConsEx.age = 10;
        //System.out.println(StudentConsEx.name); As non static lets create object
        
        StudentConsEx st = new StudentConsEx();
        st.name = "Akash";
        System.out.println("Printing from object 1"+st.name);
        
        StudentConsEx st1 = new StudentConsEx("Vivek",20);
        System.out.println("Printing from object 2"+st1.name);
        
        StudentConsEx st2 = new StudentConsEx("Nex","PG",22);
        System.out.println("Printing from object 3"+st2.name);
        
        StudentConsEx st3 = new StudentConsEx();
        st3 = st2;
        System.out.println("Printing from object 4 = Object 3"+st3.name);
    }
}
