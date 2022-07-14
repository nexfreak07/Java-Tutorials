class Test
{
    public static void main(String[] args)
    {
        VariablesStaticAndNonStaticMethods.name = "Akash"; // Variables also needs to be static to access to static method
        
        VariablesStaticAndNonStaticMethods st = new VariablesStaticAndNonStaticMethods();
        st.surname = "Dasgupta";
        st.age = 22;
        System.out.println(st.name);
        
        
        
    }
}
