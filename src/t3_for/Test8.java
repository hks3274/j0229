package t3_for;


public class Test8 {
	public static void main(String[] args) {
		
		int cnt = 0;
		
		//label을 적어주면 해당 for문을 탈출 시켜 줄 수 있다. 이건 몰랐네
		
		for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=4; j++) {
						cnt++;
						System.out.println(cnt + ", i = "+i+", j = "+j);
						//앞의 문장을 6번 수행 후 탈출시키고자 한다. 
						if(cnt == 6) return;  //main 메소드 자체가 끝남
						
			}
			System.out.println();
			
			
			//향상된 for문
		}
	}
}
