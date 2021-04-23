import java.util.Scanner;

public class Main {
    public static int pow_m(int a, int b) {
        int i, t = a;
        for (i = 1; i < b; i++)
            a = a * t;

        return a;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double n = in.nextDouble();
        

        int start = pow_m(10, (int)(n - 1));
        int end = pow_m(10, (int)(n)) - 1;

        for (int i = start; i <= end; i += 1) {
            int summ = 0;
            int ip = i;
            while (ip > 0) {
                summ += pow_m((ip % 10), (int) n);
                ip /= 10;
            }
            if (summ == i) {

                System.out.println(i);
            }
        }
        in.close();
    }

}
