package Practice;

import java.util.Scanner;
import java.util.Arrays;

public class practice8 { // 대문자를 소문자로, 소문자를 대문자로 변환
	public static void main(String args[]) {

		System.out.println("Hello, World를 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		char[] output = input.toCharArray();

		for (int i = 0; i < output.length; i++) {
			if (output[i] >= 'a' && output[i] <= 'z') {
				output[i] = (char) (output[i] - 32);
			} else if (output[i] >= 'A' && output[i] <= 'Z') {
				output[i] = output[i] = (char) (output[i] + 32);
			}
		}
		System.out.print(output);

	}

}
