import java.util.Scanner;

public class add_the_odd_number {
    public static void main(String args[])
    {
        int sum = 0;
        Scanner o= new Scanner(System.in);
        System.out.print("enter the numbers 1 = ");
        int a = o.nextInt();
        System.out.print("enter the numbers 2 = ");
        int b = o.nextInt();
        System.out.print("enter the numbers 3 = ");
        int c = o.nextInt();
        System.out.print("enter the numbers 4 = ");
        int d = o.nextInt();
        System.out.print("enter the numbers 5 = ");
        int e = o.nextInt();
        
        if ( a%2!=0)
        {
            sum = sum + a;
        }
        if ( b%2!=0)
        {
            sum = sum + b;
        }
        if ( c%2!=0)
        {
            sum = sum + c;
        }
        if ( d%2!=0)
        {
            sum = sum + d;
        }
        if ( e%2!=0)
        {
            sum = sum + e;
        }
        System.out.println("sum = "+sum);
        o.close();
    }
    
}
