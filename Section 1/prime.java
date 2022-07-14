import java.util.Scanner;
class prime
{
   public void main()
   {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");
     int number = sc.nextInt();
     prime(number);      
    }
   public void prime(int n)
   {
     for(int i = 2; i<=n; i++)// Range loop
     {
         int count = 0;
         for(int j = 2; j<i; j++)// Check loop that A number is divisible by abyother number or not, till the number
         {
             if(i%j==0) // Number(i) is divisible by some number(j)
             count++; //Increrse the count as this is not prime number
         }
         if(count==0) // If not divisible print it
         System.out.println(i);
     }

    }
}