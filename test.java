import java.util.Scanner;

// import javax.print.DocFlavor.STRING;

public class test
{
    public static void main(String args[])
    {
        Scanner o = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String name = o.nextLine();
        System.out.print("This is your name = "+name);
        o.nextLine();
    }
}