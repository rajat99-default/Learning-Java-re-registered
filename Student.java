import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        int a,b;
        Scanner obj = new Scanner(System.in);
        a = obj.nextInt();
        b = obj.nextInt();
        System.out.println("Sum is = "+(a+b));
        obj.close();
        
        
    }
}
