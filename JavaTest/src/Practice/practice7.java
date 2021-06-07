package Practice;
import java.util.Arrays;

public class practice7 // ±¹,¿µ,¼ö ÇÕ°è¿Í Æò±Õ (5¸í)
{
	public static void main(String args[]) {
		int[][] score = { { 90, 80, 80 }, { 85, 85, 95 }, { 95, 70, 75 }, { 80, 80, 90 }, { 90, 75, 80 } };

		double sum_id1 = 0, sum_id2 = 0, sum_id3 = 0,sum_id4 = 0,sum_id5 = 0;
		for(int i=0;i<3;i++)
		{
			sum_id1 += score[0][i];
			sum_id2 += score[1][i];
			sum_id3 += score[2][i];
			sum_id4 += score[3][i];
			sum_id5 += score[4][i];
		}
		System.out.print("ID 1 ÇÕ°è:"+ sum_id1 + "Æò±Õ:" + (Math.round(sum_id1/3*100)/100.0) +"\n");
		System.out.print("ID 2 ÇÕ°è:"+ sum_id2 + "Æò±Õ:" + (Math.round(sum_id2/3*100)/100.0)+"\n");
		System.out.print("ID 3 ÇÕ°è:"+ sum_id3 + "Æò±Õ:" + (Math.round(sum_id3/3*100)/100.0) +"\n");
		System.out.print("ID 4 ÇÕ°è:"+ sum_id4 + "Æò±Õ:" + (Math.round(sum_id4/3*100)/100.0)+"\n");
		System.out.print("ID 5 ÇÕ°è:"+ sum_id5 + "Æò±Õ:" + (Math.round(sum_id5/3*100)/100.0)+"\n");

	}
}

