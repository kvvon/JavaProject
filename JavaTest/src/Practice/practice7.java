package Practice;

import java.util.Arrays;

public class practice7 // 국,영,수 합계와 평균
{
	public static void main(String args[]) {
		int[][] score = { { 90, 80, 80 }, { 85, 85, 95 }, { 95, 70, 75 }, { 80, 80, 90 }, { 90, 75, 80 } };

		double sum_id1 = 0, sum_id2 = 0, sum_id3 = 0, sum_id4 = 0, sum_id5 = 0;
		for (int i = 0; i < 3; i++) {
			sum_id1 += score[0][i];
			sum_id2 += score[1][i];
			sum_id3 += score[2][i];
			sum_id4 += score[3][i];
			sum_id5 += score[4][i];
		}
		System.out.print("ID 1 합계:" + sum_id1 + "평균:" + (Math.round(sum_id1 / 3 * 100) / 100.0) + "\n");
		System.out.print("ID 2 합계:" + sum_id2 + "평균:" + (Math.round(sum_id2 / 3 * 100) / 100.0) + "\n");
		System.out.print("ID 3 합계:" + sum_id3 + "평균:" + (Math.round(sum_id3 / 3 * 100) / 100.0) + "\n");
		System.out.print("ID 4 합계:" + sum_id4 + "평균:" + (Math.round(sum_id4 / 3 * 100) / 100.0) + "\n");
		System.out.print("ID 5 합계:" + sum_id5 + "평균:" + (Math.round(sum_id5 / 3 * 100) / 100.0) + "\n");

	}
}
