package ch05;

public class ex8 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		/* �ε����� 2�� ����� ��쿡�� �� �Է� */
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				arr[i] = i + 10;
			}
		}
		int sum = 0;
		int count = 0;
		float avg = 0f;
		//
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				sum = sum + arr[i];
				count++;

			}
			if (i % 2 == 0) {
				avg = sum / count;
			}

		}
		System.out.println("��:" + sum);
		System.out.println("���:" + avg);
	}
}
