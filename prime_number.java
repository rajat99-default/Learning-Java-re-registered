import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner o  = new Scanner(System.in);
        int a = o.nextInt();
        int f=0;
        for(int i = 1;i<=a;i++)
        if(a%i==0)
        {
            f++;
        }
        if(f==2)
        {
            System.out.print("ths is prime");

        }
        else
        {
            System.out.print("not a prime");
        }
    }
    
}
