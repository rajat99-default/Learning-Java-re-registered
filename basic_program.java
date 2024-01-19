import java.util.Scanner;

public class basic_program {

    public static void main(String args[])
    {
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter your name = ");
        String name = obj.nextLine();
        System.out.print("Enter Enrollment number = ");
        int ent = obj.nextInt();
        System.out.print("Enter Chemistry marks = ");
        int c = obj.nextInt();
        System.out.print("Enter Maths marks = ");
        int m = obj.nextInt();
        System.out.print("Enter English marks = ");
        int e = obj.nextInt();
        System.out.print("Enter Hindi marks = ");
        int h = obj.nextInt();
        System.out.print("Enter Physics marks = ");
        int p = obj.nextInt();
        double percent = (c+m+e+h+p);
        System.out.println("Your name is = "+name);
        System.out.println("Your enrollment number is = "+ent);
        System.out.println("Your total percentage is = "+percent);

        obj.nextLine();
        obj.close();
    }
}