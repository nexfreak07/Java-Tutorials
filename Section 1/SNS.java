class SNS// Template
{
    int a = 15;
    static int b = 10;
    
     public static void main(String[] args)
     {
       Print.show();
         Print p = new Print();
        System.out.println(p.x);
       p.display();
     }
}
class Print
{
    int x = 11;
    static int y = 12;
    public static void show()
     {
            System.out.println(y);
            Print p = new Print();
            System.out.println(p.y);
     }
     public void show1()
     {
         System.out.println("Access nnsf from nsf");
        }
    public void display()
     {
         Print p = new Print();
         System.out.println("Printing non static variable"+p.y);
     }
} 