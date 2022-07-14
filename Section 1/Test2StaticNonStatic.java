/*
 Conclusion --> Static methods can call static methods and static variables without objects, if yopu want to call non static 
 methods in static block yopu need to create object.
 
 Non Static Method can call Static method without object, as well as no  static methods can be called by creating objects.
 
 In case of Variables, if needs to be accessed without object in static or non static block, 
 it needs to be declared as static, else create object 
 */
public class Test2StaticNonStatic
{
    public static void main(String args[])
    {
        // Calling Static Method without Object
        
        VariablesStaticAndNonStaticMethods.create();
        // It will run as static method is called under static block
       // VariablesStaticAndNonStaticMethods.create2(); // Gives Error as calling without object
        VariablesStaticAndNonStaticMethods v = new VariablesStaticAndNonStaticMethods();
        v.create2(); // Calling after creating object will work fine
        v.surname = "Akash";
    }
    public void main1()
    {
        
        System.out.println("Calling from non static method, a static method");
        VariablesStaticAndNonStaticMethods.create();
        VariablesStaticAndNonStaticMethods v = new VariablesStaticAndNonStaticMethods();
        
        System.out.println("Callin g after object both static and non static from non static method");
        v.create();
        v.create2();
    }
}

