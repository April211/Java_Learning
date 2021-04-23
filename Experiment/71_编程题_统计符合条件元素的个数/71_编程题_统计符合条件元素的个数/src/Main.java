
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		double n = 0.0;
		Scanner in = new Scanner(System.in);
		n = in.nextDouble();
		int even_cnt = 0;			// 偶数计数
		int odd_cnt = 0;			// 奇数计数
		for(double i = 1.0; i<= n; i += 1.0)
		{
			if((i % 3 == 0) && (i % 2 == 0))
			{
				even_cnt++;
			}
			else if((i % 3 == 0) && (i % 2 != 0))
			{
				odd_cnt++;
			}
		}
		
		System.out.printf("%d,%d", odd_cnt, even_cnt);
        in.close();
	}

}
