package ch01;

public class UnixTime {
	public static void main(String[] args) {
		// 0.0 <= N < 1.0
		int num1 = (int) (Math.random() * 6 + 1);
		System.out.println("1�� " + num1);
		int num2 = (int) (Math.random() * 6 + 1);
		System.out.println("2�� " + num2);
		
		System.out.println("�ΰ��� ���� "+ (num1 + num2 ));
	}

}
