package Practice;

import java.util.Scanner;

public class practice1 // 섭씨를 화씨 변환
{
	public static void main(String[] arg) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("섭씨온도를 입력하세요:");
		double Celsius_temperature = scanner.nextDouble(); // 섭씨
		double Fahrenheit_temperature = (Celsius_temperature * 9 / 5) + 32; 

		System.out.println("섭씨:" + Celsius_temperature);
		System.out.println("화씨:" + Fahrenheit_temperature);

		scanner.close();
	}

}
