import java.util.Scanner;

public class sum_of_digit {

    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int sum = 0;
        System.out.println("enter number ");
        Scanner o = new Scanner(System.in);
        a = o.nextInt();
        while (a > 0) {
            b = a % 10;
            sum += b;
            a /= 10;
        }
        System.out.println(sum);
        o.close();
    }
}