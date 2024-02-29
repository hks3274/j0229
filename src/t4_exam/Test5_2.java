package t4_exam;

import java.util.Scanner;

//최대값 구하기(초기값 지정 방식 )
public class Test5_2 {
	public static void main(String[] args) {
		// 단, 2자리 이하의 정수만을 입력받는다.
		Scanner sc = new Scanner(System.in);
		int max = -99, min = 99, num, sw = 0;

		while (true) {
			System.out.print("수를 입력하세요 (종료시 999입력): ");
			num = sc.nextInt();

			if (num == 999)
				break;

			if (num > max) {
				max = num;
				
				if(sw == 0) {
					if (num < min) {
						sw =1;
						if(num < min) min = num; 
					}
					
				}
			}
			else if (num < min) min = num;

		}

		System.out.println("최대값 :" + max + ", 최소값 :" + min);
		sc.close();
	}
}
