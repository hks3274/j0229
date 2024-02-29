package t4_exam;

import java.util.Scanner;

//숫자맞추기게임 (1~100)까지의 자연수
public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int rand = (int)(Math.random()*100)+1;
		int cnt = 1;
		
		while(cnt <= 5) {

			System.out.print("수를 입력하세요 (1~100): ");
			int num = sc.nextInt();

			if(rand == num) {
				System.out.println("정답입니다");
				break;
			} else if(num > rand ) System.out.println("더 작은 수를 입력하세요");
			else System.out.println("더 큰 수를 입력하세요");
			cnt++;
		}
		
		if(cnt == 6)System.out.println("실패입니다. 다시 시도해주세요.");
		System.out.println("정답은 "+rand+"입니다");
		
		System.out.println();
		sc.close();
	}
}
