package ch04;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		int count = 0;
		int start = 60;
		int range = 20;
		int random = (int)(Math.random()*range + start);//60~79
				
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("�Է� : ");
			int num = s.nextInt();
			count = count + 1;
			
			if((start > num)  || ((range + (start-1)) < num)) {
				System.out.println("���� ���");
			}
			else if(random == num) {
				System.out.println("������");
				break;
			}
			else if(random >num) {
				System.out.println("ū���� �Է��ϼ���");
			}
			else {System.out.println("�������� �Է��ϼ���");
			}
		}
		System.out.println("�õ� Ƚ�� : " + count);
		
		
		s.close();
				
	}
}
