package t3_for;


public class Test5_2 {
	public static void main(String[] args) {
		// 중첩 for문 쓰기
		
		int cnt = 0;
		
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=4; j++) {
						cnt++;
						System.out.println(cnt + ", i = "+i+", j = "+j);
			}
			System.out.println();
		}
	}
}
