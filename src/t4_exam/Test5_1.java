package t4_exam;

import java.util.Scanner;

//최대값 구하기(Two Read)
public class Test5_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max, min, num;
		
		System.out.print("수를 입력하세요 : ");
		num =sc.nextInt();
		max = min = num;
		
		while(true) {
			System.out.print("수를 입력하세요 (종료시 999입력): ");
			num =sc.nextInt();
			
			if(num == 999) break;
			
			if(num > max) max = num;		
			else if(num < min) min = num;
		}
		
		System.out.println("최대값 :"+max+", 최소값 :"+min);
		sc.close();
	}
}
