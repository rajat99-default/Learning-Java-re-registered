import java.util.Scanner;
public class odd_even_switch_case {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        switch (a%2) {
            case 0:
            System.out.println("even");
            break;
            case 1:
            System.out.println("odd");
            break;
            case 'i':
            // System.out.println("vowel");
            // break;
            // case 'o':
            // System.out.println("vowel");
            // break;
            // case 'u':
            // System.out.println("vowel");
            // break;
            // default:
            // System.out.println("not a vowel");
        }
        scanner.close();
    }
}

