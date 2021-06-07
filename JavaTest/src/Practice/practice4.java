package Practice;

import java.util.Scanner;

public class practice4 //*트리 출력하기
{
	public static void main(String args[])
	{
		System.out.println("출력될 층 수를 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		int i=scanner.nextInt();
		int a,b;
		for(a=0;a<=i;a++)
		{
			for(b=0;b<a;b++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
