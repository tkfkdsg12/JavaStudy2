package ch03;

public class Exam03_07 {
	public static void main(String[] args) {
		 int num = 12345;
		 // �ڵ� �ۼ� (% ������)
		 int num1 = num % 10;//5
		
		 num = num / 10;//1234
		 int num2 = num % 10;//4
		
		 num = num / 10;//123
		 int num3 = num % 10;//3
		
		 num = num / 10;//123
		 int num4 = num % 10;//2
		
		 num = num / 10;//12
		 int num5 = num % 10;//1
		 
		 // ctrl + alt + ��  -> �� ����
		
		 int total = num1 + num2 + num3 + num4 + num5;
		 System.out.println("�� �ڸ� ������ �� : " + total);
	}

}
