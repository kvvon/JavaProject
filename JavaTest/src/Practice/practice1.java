package Practice;

import java.util.Scanner;

public class practice1 //¼·¾¾¸¦ È­¾¾ º¯È¯
{
	public static void main(String[] arg)
	{
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("¼·¾¾¸¦ÀÔ·ÂÇÏ¼¼¿ä:");
		double Celsius_temperature = scanner.nextDouble(); // ¼·¾¾
		double Fahrenheit_temperature= (Celsius_temperature * 9/5) + 32;
		
		System.out.println("¼·¾¾:"+Celsius_temperature);
		System.out.println("È­¾¾:"+Fahrenheit_temperature);
		
		scanner.close();
	}

}
