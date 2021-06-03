package Practice;

public class practice3
{
	public static void main(String[] args)
	{
		int i,j; //i=단 수 j= 곱해질 수
		for(i=1;i<10;i++)
		{
			System.out.println("**"+i+"단**");
			for(j=1;j<10;j++)
			{
				System.out.println(i+"x"+j+"="+(i*j));
			}
			System.out.println("\n");
		}	
	}    

}
