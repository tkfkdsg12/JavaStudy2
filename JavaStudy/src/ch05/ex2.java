package ch05;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ�. = > ");
		int num1 = s.nextInt();
		int count = 0;
		int count2 = 0;
		for (int i = 1; i <= num1; i++) {
			int num = i;
			int num2 = i;

			while (num > 0) {
				int num3 = num % 10;
				if (num3 == 8) {
					count++;
				}
				num = num / 10;
			}

			if (num2 % 4 == 0) {
				count2++;
			}
		}
		System.out.println();
		System.out.println("8�� ���� : " + count);

		System.out.println();
		System.out.println("4�� ����� ���� : " + count2);

	}
}