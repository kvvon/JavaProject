package Practice;
import java.util.Scanner;

public class practice1  //������ ȭ����ȯ
{

	public static void main(String[] arg)
	{
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("�������Է��ϼ���:");
		double a = scanner.nextDouble(); //a�� ����
		double b = (a * 9/5) + 32;
		System.out.println("����:"+a);
		System.out.println("ȭ��:"+b);
		
		scanner.close();
	}

	
}
