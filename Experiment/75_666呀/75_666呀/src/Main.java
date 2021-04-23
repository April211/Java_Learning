import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int sn = 0;
        int ip = 0;
        for (int i = 0; i < n; i++) {
            ip = ip * 10;
            ip += 6;
            // System.out.println("ip: " + ip);
            sn += ip;
        }
        System.out.println(sn);

        cin.close();
    }
}
