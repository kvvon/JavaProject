package Practice;

import java.util.Scanner;
import java.util.Arrays;

public class practice9 { // 시저의 암호
	public static void main(String args[]) {
		System.out.println("Hello, World를 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		char[] output = input.toCharArray();
		for (int i = 0; i < output.length; i++) {
			if (output[i] >= 'a' && output[i] <= 'z') {
				output[i] = (char) (output[i] + 3);
			} else if (output[i] >= 'A' && output[i] <= 'Z') {
				output[i] = output[i] = (char) (output[i] + 3);
			}
		}
		System.out.print(output);

	}

}
