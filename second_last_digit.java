import java.util.Scanner;

public class second_last_digit 
{
    public static void main(String args[])
    {
        Scanner o = new Scanner(System.in);
        System.out.print("Enter the number = ");
        int a = o.nextInt();
        System.out.print("\nthis is the second last digit = "+(a/10)%10);
        o.close();
        
        
    }
}
