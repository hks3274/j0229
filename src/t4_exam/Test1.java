package t4_exam;

//난수(무작위수) 생성 Math는 내장형 함수 --> random 함수
public class Test1 {
	public static void main(String[] args) {

		int rand = (int) (Math.random() * 100); // 0이상~ 1미만의 실수형 난수

		for (int i = 0; i < 5; i++) {
			System.out.println("rand : " + Math.random());

		}

		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.println(i + " : " + (Math.random() * 10)); // 0이상 ~ 10미만 실수형 난수
		}

		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.println(i + " : " + (int) (Math.random() * 10)); // 0이상 ~ 10미만 정수형 난수
		}

		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.println(i + " : " + ((int)(Math.random() * 10)+1)); // 0이상 ~ 10이하의 정수형 난수
		}
		
		System.out.println();

		for (int i = 0; i < 5; i++) {
			System.out.println(i + " : " + ((int)(Math.random() * 45)+1)); // 0이상 ~ 10이하의 정수형 난수
		}
	}
}
