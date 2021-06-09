package Practice;

public class practice10 { // 사칙연산 메서드 (3+5-2)x2/3=4
	public static int add(int x, int y) {
		return x + y;
	}

	public static int substract(int x, int y) {
		return x - y;
	}

	public static int divide(int x, int y) {
		return x / y;
	}

	public static int multiply(int x, int y) {
		return x * y;
	}

	public static void main(String[] args) {

		System.out.print("(3 + 5 - 2) x 2 / 3 = ");
		System.out.println(divide(multiply(substract(add(3, 5), 2), 2), 3));
	}

}
