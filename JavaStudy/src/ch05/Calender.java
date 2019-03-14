package ch05;

import java.util.Calendar;

public class Calender {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int dayofweek = cal.get(Calendar.DAY_OF_WEEK);
		int lastDate = cal.getLeastMaximum(Calendar.DATE);

		System.out.println("��    ȭ    ��    ��    ��    ��    ��");
		System.out.println("====================");
		for (int i = 1; i <= dayofweek; i++) {
			System.out.print("   ");
		}
		for (int i = 1; i <= lastDate; i++) {
			if (i < 10) {
				System.out.print("0" + i + " ");

			} else {
				System.out.print(i + " ");

			}
			dayofweek++;
			if (dayofweek % 7 == 0) {
				System.out.println();
			}
//		System.out.println(year + "��");
//		System.out.println(month + "��");
//		System.out.println(date + "��");
//		System.out.println(dayofweek);
//		System.out.println(lastDate);
		}
	}
}
