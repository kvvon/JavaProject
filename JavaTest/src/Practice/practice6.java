package Practice;

import java.util.Scanner;
import java.util.Arrays;

public class practice6 // 10�� �л� ���� �հ�� ���
{
	public static void main(String args[]) {
		System.out.println("10���� ������ �Է��ϼ���:");
		Scanner scanner = new Scanner(System.in);
		int[] j = new int[10];
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			j[i] = scanner.nextInt();
			sum += j[i];
		}

		System.out.print("�հ�:" + sum);
		System.out.print("���:" + sum / j.length);

	}

}
