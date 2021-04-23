import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 输入一个char
        Scanner cin = new Scanner(System.in);
        String s = cin.nextLine();

    
        char a = s.charAt(0);       // 第一个字母

        if ((a >= 'a' && a <= 'z') || (a >= 'A' && a <= 'Z')) {
            if ((a >= 'a' && a <= 'c') || (a >= 'A' && a <= 'C'))
                System.out.println(2);
            if ((a >= 'd' && a <= 'f') || (a >= 'D' && a <= 'F'))
                System.out.println(3);
            if ((a >= 'g' && a <= 'i') || (a >= 'G' && a <= 'I'))
                System.out.println(4);
            if ((a >= 'j' && a <= 'l') || (a >= 'J' && a <= 'L'))
                System.out.println(5);
            if ((a >= 'm' && a <= 'o') || (a >= 'M' && a <= 'O'))
                System.out.println(6);
            if ((a >= 'p' && a <= 's') || (a >= 'P' && a <= 'S'))
                System.out.println(7);
            if ((a >= 't' && a <= 'v') || (a >= 'T' && a <= 'V'))
                System.out.println(8);
            if ((a >= 'w' && a <= 'z') || (a >= 'W' && a <= 'Z'))
                System.out.println(9);
        } 
        else
        {
            System.out.println(a + " is an invalid input");
        }

        cin.close();
    }
}
