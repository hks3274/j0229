package t4_exam;

import java.util.Scanner;

//주사위숫자 맞추기게임 (1~100)까지의 자연수
public class Test4_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = 0, rand = 0;

		while (true) {
			System.out.print("출력될 주사위의 눈금을 입력하세요: ");
			num = sc.nextInt();

//			if (num > 6 || num < 1) {
//				System.out.println("1~6까지의 수를 입력하세요.");
//			} else break;

			if (num >= 1 && num <= 6) break;
			System.out.println("1~6까지의 수를 입력하세요.");
		}

		rand = (int) (Math.random() * 6) + 1;

		if (num == rand)
			System.out.println("정답입니다.");
		else
			System.out.println("틀렸습니다. 출력된 주사위의 눈금은 " + rand + " 입니다");

		sc.close();
	}

}
