package t1_while;

import java.util.Scanner;

public class Test2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0, i= 0,  breakSu = 5;
		
		
		System.out.print("출력하는 수를 입력하세요: ");
		num = sc.nextInt();
				
				
		i = 0;
		while(i < num) {
			i++;
			System.out.println(i);
			
			if(i == breakSu) break;
			
		}
		
		sc.close();
		
	}

}
