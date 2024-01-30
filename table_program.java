import java.util.Scanner;

public class table_program {
    public static void main(String args[])
    {
        Scanner o  =new Scanner(System.in);
        System.out.println("Enter the number = ");
        int a = o.nextInt();
        for(int i=1;i<=10;i++)
        {
            int b = a*i;
            System.out.print(a+" x "+i+" = "+b+"\n");
        }
        o.close();
    }
}
