interface Demo1
{
    int u = 10;
}
enum Mob implements Demo1 // enum can also implements interface
{
    //Specifying the price in the objects itself
    Apple(5000), Samsung, HTC(500);
    // Methods and Variables are also possible, this is what makes variables different
    int price;
    Mob()
    {
       price = u;
    }
    Mob(int p)
    {
        price = p;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int i) {
        price = i;
    }
}
public class Enumration {
    public static void main(String[] args) {
        System.out.println(Mob.Apple);
        //Accessing variables of Enum

        System.out.println(Mob.Apple.getPrice());

        //Setting variables
        System.out.println("Parameters set for Apple");
        Mob.Apple.setPrice(1000);
        System.out.println("Getting parameters of A");
        System.out.println(Mob.Apple.getPrice()); // Get method will be called if set
        System.out.println("Getting parameters of HTC without setting but gettig called by parameterized constructor");
        System.out.println(Mob.HTC.getPrice()); // Constructor will be called if not set
        System.out.println("Getting parameters of Samsung by Default Constructor");
        System.out.println(Mob.Samsung.getPrice());

        //using Enum inside switch
        Mob m = Mob.Samsung;


        switch (m)
        {
            case HTC:
                System.out.println("HTC");
                break;
            case Apple:
                System.out.println("Apple");
                break;
            case Samsung:
                System.out.println("This is Samsung");
                break;
            default:
                System.out.println("Default");
        }

        //Ordinal Methods - Prints the order of the enum constants
        System.out.println(Mob.Apple.ordinal());
        System.out.println(Mob.Samsung.ordinal());
        //If it has order we can fetch all the constants to an array below
        System.out.println("Printing mobile array values");
        Mob mobs[] = Mob.values(); // Given by Object class
        for(Mob i : mobs)
            System.out.println(i);
    }

}
// What happens behind the scene - The compiler creates a class of named enum, and creates a final variable of all
// the variables inside the enum class
//Below is what happens behind the scene

//class Mob
//{
//    static final Mob Apple = new Mob();
//    static final Mob Samsung = new Mob();
//    static final Mob HTC = new Mob();
//}
