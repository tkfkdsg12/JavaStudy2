package ch05;

public class ex8 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		/* 인덱스가 2의 배수인 경우에만 값 입력 */
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
		System.out.println("합:" + sum);
		System.out.println("평균:" + avg);
	}
}
