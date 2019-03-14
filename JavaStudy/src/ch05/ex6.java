package ch05;

public class ex6 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, };
		String sep2 = "";
		for (int i = 0; i < 9; i++) {
			if (i % 2 == 0) {
				System.out.print(sep2 +arr[i]);
				sep2 = ",";
			}
		}
		System.out.println();
		String sep1 = "";
		for (int i = 0; i < arr.length; i += 2) {
			System.out.print(sep1 + arr[i]);
			sep1 = ",";
		}
		System.out.println();
		String sep = "";
		for (int i = 0; i < arr.length; i += 2) {
			System.out.print(sep + arr[i] * 4 / 2);
			sep = ",";
		}
	}
}