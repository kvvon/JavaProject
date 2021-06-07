package Practice;
import java.util.Scanner;

public class practice10 {
	public static void main(String args[])//(3 + 5 - 2) X 2 / 3 = 4
	{
		System.out.print("두 정수를 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(a + "+" + b + "=" + add(a,b));
        System.out.println(a + "-" + b + "=" + subtract(a,b));
        System.out.println(a + "*" + b + "=" + multiply(a,b));
        System.out.println(a + "/" + b + "=" + divide(a,b));

        System.out.println("("+a + "+"+ add(a,b) +"-"+ b +")X"+b+"/"+a+"="
        		+ result(a,b));
        


    }
    static double add (int x, int y)
    {
        return x+y;
    }
    static double subtract (int x, int y)
    {
        return x-y;
    }
    static double divide (int x, int y)
    {
        return x/y;
    }
    static double multiply (int x, int y)
    {
        return x*y;
    }
    static double result (int x, int y)
    {
    	return (x + (x+y) - y) * y / x;
    }
}
