package ch04;

public class Exam4_5_1 {
	public static void main(String[] args) {
		boolean isContinue = true;
		int count = 0;

		while (isContinue) {
			int num1 = (int) (Math.random() * 6 + 1);
			int num2 = (int) (Math.random() * 6 + 1);
			count = count + 1;
			System.out.println("( " + num1 + " , " + num2 + " )");
			if (num1 + num2 == 10) {
				//isContinue = false;
				break;
			} 
			else {
			}
		}
		System.out.println("��������");
		System.out.println("�ֻ����� ���� Ƚ�� : " + count);
	}

}
