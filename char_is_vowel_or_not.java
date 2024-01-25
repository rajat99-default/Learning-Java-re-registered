// import java.util.Scanner;

// public class char_is_vowel_or_not

// {
//     public static void main(String[] args) 
//     {
//         Scanner o = new Scanner(System.in);
//         char a = o.next().charAt(0);
//         if (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O'
//                 || a == 'U') {
//             System.out.println("this is vowel");
//         } else {
//             System.out.println("no");

//         }

//         o.close();
//     }

// }

import java.util.Scanner;

class char_is_vowel_or_not {
    public static void main(String args[]) {
        char c;
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Any Character : ");
        c = kb.next().charAt(0);
        if (c >= 'a') {
            if (c <= 'Z') {
            }
        } else if (c >= 'A') {
            System.out.println("lower case");
            if (c <= 'Z') {
            }
            System.out.println("Upper Case");
        }
        kb.close();
    }
}
