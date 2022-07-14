 import java.util.*;
public class Perfect
{
    public  void main()
    {
        Scanner sc = new Scanner(System.in);
        int choice;
        
       
            System.out.println("Enter the number");
            int number = sc.nextInt();
            System.out.println("1 for Even nuumber in the range of 0 to "+number);
            System.out.println("2 for Odd nuumber in the range of 0 to "+ number);
            System.out.println("3 for Prime nuumber in the range of 0 to "+ number);
            System.out.println("4 for Composite nuumber in the range of 0 to "+ number);
            System.out.println("Type 0 to exit");
            System.out.println("Enter the choice");
            choice = sc.nextInt();
            
            
            switch(choice)
            {
                case 1 : 
                    even(number);
                    break;
                case 2 :
                    odd(number);
                    break;
                case 3 :
                    prime(number);
                    break;
                case 4: 
                    composite(number);
                    break;
                
                default: System.out.println("Invalid Choice");
                
            }
           
    }
    public void even(int n)
    {
        for(int i=0; i<=n; i++)
        {
            if(i%2==0)
            System.out.println(i);
        }
    }
    public void odd(int n)
    {
        for(int i=1; i<=n; i++)
        {
            if(i%2!=0)
            System.out.println(i);
        
        }
    }
    public void prime(int n)
    {
        for(int i=2; i<=n; i++)// Range Loop
        {
            int count = 0;
            for(int j=2; j<i; j++)// Check by dividing loop
            {
                if(i%j==0)
                count++;
            }
            if(count==0)
            System.out.println(i);
        }
    }
    public void composite(int n)
    {
        for(int i=2; i<=n; i++)// Range Loop
        {
            int count = 0;
            for(int j=2; j<i; j++)// Check by dividing loop
            {
                if(i%j==0)
                count++;
            }
            if(count!=0)
            System.out.println(i);
        }
    }
}