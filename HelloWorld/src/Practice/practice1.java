package Practice;
import java.util.Scanner;

public class practice1  //¼·¾¾¸¦ È­¾¾º¯È¯
{

	public static void main(String[] arg)
	{
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("¼·¾¾¸¦ÀÔ·ÂÇÏ¼¼¿ä:");
		double a = scanner.nextDouble(); //a´Â ¼·¾¾
		double b = (a * 9/5) + 32;
		System.out.println("¼·¾¾:"+a);
		System.out.println("È­¾¾:"+b);
		
		scanner.close();
	}

	
}
