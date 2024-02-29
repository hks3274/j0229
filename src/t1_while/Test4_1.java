package t1_while;

public class Test4_1 {
	public static void main(String[] args) {
		int i =0;
		
		while(i < 10) {
			i++;
			
			//i의 값이 짝수인 경우만 출력하시오.(단, 홀수의 경우는 출력하지 않고 다시 조건을 비교하시오.)
			if(i %2 != 0) continue; // 위로 올라가서 다시 봐라 
				
			System.out.println(i);
		}
	}
}
