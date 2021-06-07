package Practice;

import java.util.Scanner;
import java.util.Arrays;

public class practice6 // 10명 학생 점수 합계와 평균
{
	public static void main(String args[]) {
		System.out.println("10명의 점수를 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		int[] j = new int[10];
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			j[i] = scanner.nextInt();
			sum += j[i];
		}

		System.out.print("합계:" + sum);
		System.out.print("평균:" + sum / j.length);

	}

}
