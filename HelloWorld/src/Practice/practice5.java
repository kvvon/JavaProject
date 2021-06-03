package Practice;
import java.util.Scanner;

public class practice5 //학점계산
{
	public static void main(String[] args)
	{
		System.out.println("점수를 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		int point =scanner.nextInt();
		
		if(point>=90)
		{
			System.out.println("학점:A");
		}
		else if(90>point && point>=80)
		{
			System.out.println("학점:B");
		}		
		else if(80>point && point>=70)
		{
			System.out.println("학점:C");
		}
		else if(70>point && point>=60)
		{
			System.out.println("학점:D");
		}
		else
		{
			System.out.println("학점:F");
		}
		scanner.close();
		

	}
	
}
