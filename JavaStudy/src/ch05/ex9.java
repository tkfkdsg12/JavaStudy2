package ch05;

public class ex9 {
	public static void main(String[] args) {
		char[] chars = { 'b', 'e', 'z', 'a', 'w' };

		char temp = ' ';

		for (int i = 0; i < chars.length - 1; i++) {

			for (int j = i + 1; j < chars.length; j++) {

				if (chars[i] > chars[j]) {
					temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}

			}
		}
		System.out.println(chars);
	}
}