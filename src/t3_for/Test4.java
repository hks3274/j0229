package t3_for;

/*
 * for(int i = 초기값; 조건식; 증감식){
 * 	
 *    조건을 만족할떄 수행처리할 내용...
 * }
 * 
 */

public class Test4 {
	public static void main(String[] args) {
		//조건을 만족하면 해당 조건만큼만 처리할 내용을 수행한다.
		int i = 0;
		for(;;) { //무한루프
			System.out.println(i);
			i++; // 
			
		if(i == 10) break;
		}
//		System.out.println("작업 끝..");
	}
}
