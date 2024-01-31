import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int factorial =0;
        Scanner o = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = o.nextInt();
        
        number = o.nextInt();
        for(int i=1;i<=number;i++)
        {
            factorial = factorial*i;
        }
        System.out.print("this is number  = "+factorial);
        o.close();
    }
}
