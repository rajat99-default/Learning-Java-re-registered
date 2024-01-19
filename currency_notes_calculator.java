import java.util.Scanner;

public class currency_notes_calculator {
    public static void main(String args[]) {
        System.out.print("Enter the amount = ");
        Scanner o = new Scanner(System.in);
        int a = o.nextInt();
        
        int b = a / 100;
        int rm = a - b * 100;
        System.out.print("\n100 rupee notes are = " + b);

        int c = rm / 50;
        rm %= 50;
        System.out.print("\n50 rupee notes are = " + c);

        int d = rm / 20;
        rm %= 20;
        System.out.print("\n20 rupee notes are = " + d);

        int e = rm / 10;
        rm %= 10;
        System.out.print("\n10 rupee notes are = " + e);

        int f = rm / 5;
        rm %= 5;
        System.out.print("\n5 rupee notes are = " + f);

        int g = rm / 2;
        rm %= 2;
        System.out.print("\n2 rupee notes are = " + g);

        int h = rm / 1;
        System.out.print("\n1 rupee notes are = " + h);
        o.close();
    }
}
