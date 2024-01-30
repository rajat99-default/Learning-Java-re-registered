import java.util.Scanner;

public class sum_of_natural_numbers {
    public static void main(String args[])
    {
        int b = 0;
        Scanner o = new Scanner(System.in);
        System.out.print("enter number  = ");
        int a = o.nextInt();
        for(int i=0; i<=a;i++)
        {
            b = b+i;
        }
        System.out.println(b);
        o.close();

    }
    
}
