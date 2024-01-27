import java.util.Scanner;

public class compare {
    public static void main(String[] args) {
        int a, b;
        Scanner o = new Scanner(System.in);
        a = o.nextInt();
        b = o.nextInt();
        if (a > b) {
            System.out.println("A is greater");
        } else if (b > a) {

            System.out.println("b is greater");
        } else {
            System.out.println("equal");
        }
        o.close();
    }

}