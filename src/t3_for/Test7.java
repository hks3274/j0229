package t3_for;


public class Test7 {
	public static void main(String[] args) {
		
		int cnt = 0;
		
		//label을 적어주면 해당 for문을 탈출 시켜 줄 수 있다. 이건 몰랐네
		
		atom: for (int i = 1; i <=3; i++) {
			for (int j = 1; j <=4; j++) {
						cnt++;
						System.out.println(cnt + ", i = "+i+", j = "+j);
						//앞의 문장을 6번 수행 후 탈출시키고자 한다. 
						if(cnt == 6) break atom; //신기방기 --> label을 꼭 기억하자
						
			}
			System.out.println();
			
			
			//향상된 for문 --> 오후에.. 
		}
	}
}
