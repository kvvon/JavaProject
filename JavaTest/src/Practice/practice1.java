package Practice;

import java.util.Scanner;

public class practice1 //������ ȭ�� ��ȯ
{
	public static void main(String[] arg)
	{
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("�������Է��ϼ���:");
		double Celsius_temperature = scanner.nextDouble(); // ����
		double Fahrenheit_temperature= (Celsius_temperature * 9/5) + 32;
		
		System.out.println("����:"+Celsius_temperature);
		System.out.println("ȭ��:"+Fahrenheit_temperature);
		
		scanner.close();
	}

}
