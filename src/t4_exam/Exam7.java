package t4_exam;

import java.util.Scanner;

// 4x + 5y = 60을 만족하는 x와 y의 값을 출력
public class Exam7 {
	public static void main(String[] args) {
		boolean run =true;
		int balance = 0;
		int num, money;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("===========================");
			System.out.println("1.예금| 2.출금| 3.잔고| 4.종료");
			System.out.println("===========================");
			System.out.print("선택> ");
			
			num = sc.nextInt();
			
			switch (num) {
				case 1:
					System.out.print("예금액> ");
					money = sc.nextInt();
					balance += money;
					break;
				case 2:
					System.out.print("출금액> ");
					money = sc.nextInt();
					balance -= money;
					break;
				case 3:
					System.out.print("잔고> ");
					System.out.println(balance);
					break;
				case 4:			
					run = false;
			}
			
			System.out.println();
		}
		
		System.out.println("프로그램 종료");
	}
}
