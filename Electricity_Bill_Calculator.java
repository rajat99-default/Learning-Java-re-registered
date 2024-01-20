import java.util.Scanner;


public class Electricity_Bill_Calculator 
{
    public static void main(String args[])
    {
        Scanner o = new Scanner(System.in);
        System.out.print("Enter total electricity in units = ");
        int u = o.nextInt();
        if (u<51) 
        {
            System.out.print("This is the total bill = " + u*3);    
        }
        if (u>50 && u<100) {
            System.out.print("This is your total bill = "+ u*4);
        }
        if (u>100 && u<250) {
            System.out.print("This is your total bill = "+ u*5);
        }
        if (u>250) {
            System.out.print("This is your total bill = "+ u*6);
        }
        o.close();
    }
    
}
