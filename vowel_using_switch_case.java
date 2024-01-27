import java.util.Scanner;

public class vowel_using_switch_case {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        switch (ch) {
            case 'a':
            System.out.println("vowel");
            break;
            case 'e':
            System.out.println("vowel");
            break;
            case 'i':
            System.out.println("vowel");
            break;
            case 'o':
            System.out.println("vowel");
            break;
            case 'u':
            System.out.println("vowel");
            break;
        }
        scanner.close();
    }
}