package Practice;
import java.util.Scanner;
import java.util.Arrays;

public class practice9_1 {
	public static void main(String args[]) {
		System.out.println("������ ������ 5�� �Է��ϼ���!");
		Scanner scanner = new Scanner(System.in);
		int[] input = new int[5];
		int sum =0;

			
			for (int i = 0; i < 5; i++) {
				input[i] = scanner.nextInt();
			    sum += input[i];
			}
			System.out.print("�հ�:"+sum);
		}
		

	}


