package Practice;

import java.util.Scanner;
import java.util.Arrays;

public class practice9_1 { // 합계 산출 메서드
	public static int sum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("A집합에 들어갈 5개의 정수를 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		int[] input_a = new int[5];
		for (int i = 0; i < 5; i++) {
			input_a[i] = scanner.nextInt();
		}
		System.out.println("B집합에 들어갈 5개의 정수를 입력하세요:");
		int[] input_b = new int[5];
		for (int i = 0; i < 5; i++) {
			input_b[i] = scanner.nextInt();
		}
		int sum_a = sum(input_a);
		System.out.println("Sum<A>:" + sum_a);
		int sum_b = sum(input_b);
		System.out.println("Sum<B>:" + sum_b);

	}

}


