package t1_while;

import java.util.Scanner;

public class Test2_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, i= 0,  breakSu = 5;
		
		while(true) {
			System.out.print("1부터 출력하는 수를 입력하세요: ");
			num = sc.nextInt();
			System.out.print("탈출할 수를 입력하세요: ");
			breakSu = sc.nextInt();
			
			
			if(num >= breakSu) break;
			else System.out.println("첫번째 수가 두번째 수 보다 더 큰 수를 입력하셔야 한다 이말이야~~\n");
		}		
			while(i < num) {
				i++;
				System.out.println(i);
				
				if(i == breakSu ) break;
				
			}
			
			sc.close();
		

	}

}
