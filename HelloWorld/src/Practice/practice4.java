package Practice;
import java.util.Scanner;

public class practice4//*Ãâ·Â
{
	public static void main(String args[])
	{
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
