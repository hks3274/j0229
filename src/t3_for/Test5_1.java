package t3_for;

public class Test5_1 {
	public static void main(String[] args) {
		// 중첩 for문 쓰기
		
		int cnt = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
						System.out.println(cnt++);
			}
		}
	}
}
