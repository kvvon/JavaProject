package Practice;
import java.util.Scanner;

public class practice5 //�������
{
	public static void main(String[] args)
	{
		System.out.println("������ �Է��ϼ���:");
		Scanner scanner = new Scanner(System.in);
		int point =scanner.nextInt();
		
		if(point>=90)
		{
			System.out.println("����:A");
		}
		else if(90>point && point>=80)
		{
			System.out.println("����:B");
		}		
		else if(80>point && point>=70)
		{
			System.out.println("����:C");
		}
		else if(70>point && point>=60)
		{
			System.out.println("����:D");
		}
		else
		{
			System.out.println("����:F");
		}
		scanner.close();
		

	}
	
}
