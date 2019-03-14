package ch05;

public class ex7 {
	public static void main(String[] args) {
		int[] numbers = { 3, 2, 1, 7, 4 };

		int min = 0;
		int min2 = 0;
		//int teep = Integer.MIN_VALUE; 인트로 표현할수 있는 최대값;

		for (int i = 0; i < numbers.length;i++) {
			if (numbers[i] < min || min == 0) {
				min = numbers[i];
			}
			if (numbers[i] > min2 || min2 == 0) {
				min2 = numbers[i];
			}
		}
		System.out.println("최소값은 =>" + min);
		System.out.println("최대값은 =>" + min2);
	}

}
